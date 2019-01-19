package hw.hw141218.top100;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();
        int workers = Runtime.getRuntime().availableProcessors();

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10, true);
        BlockingQueue<HashMap<String, Integer>> localMapQueue = new ArrayBlockingQueue<>(workers, true);
        HashMap<String, Integer> generalMap = new HashMap<>();

        for (int i = 0; i < workers; i++) {
            threads.add(new Thread(new Worker(queue, localMapQueue)));
        }

        for (Thread thread: threads) {
            thread.start();
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("wp.txt")));

            String s;

            while ((s = reader.readLine()) != null) {
                queue.put(s);
            }

            for (int i = 0; i < workers; i++) {
                queue.put("stop");
            }

            for (Thread thread: threads) {
                thread.join();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Map<String, Integer> map : localMapQueue) {
            for (Map.Entry entry : map.entrySet()) {
                generalMap.merge(entry.getKey().toString(), (Integer) entry.getValue(), (v1, v2) -> v1 + v2);
            }
        }

        generalMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(100).forEach(System.out::println);

    }

}

