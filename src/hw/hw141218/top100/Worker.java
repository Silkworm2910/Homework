package hw.hw141218.top100;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable {

    private HashMap<String, Integer> localMap = new HashMap<>();
    BlockingQueue<String> queue;
    BlockingQueue<HashMap<String, Integer>> localMapQueue;

    public Worker(BlockingQueue<String> queue, BlockingQueue<HashMap<String, Integer>> localMapQueue) {
        this.queue = queue;
        this.localMapQueue = localMapQueue;
    }

    @Override
    public void run() {

        String string = null;

        try {
            while (!(string = queue.take()).equals("stop")){
                String[] words = string.toLowerCase().replaceAll("\\p{P}", "").trim().split(" ");

                for(String word : words) {
                    if(localMap.containsKey(word))
                    {
                        localMap.put(word, localMap.get(word)+1);
                    }
                    else
                    {
                        localMap.put(word, 1);
                    }

                }

            }


            localMapQueue.put(localMap);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
