package lessons.lesson20;

public class Lesson20 {
    public static void main(String[] args) throws InterruptedException {
        // методы класса Thread
        // currentThread(); - для получения текущего потока (статич)
        // setName(str); задает имя потока
        // getName(); возврашает имя потока
        // join();
        // isAlive();
        // isInterrupted();
        // interrupt();


/*

        Thread thread = new Thread(); // создание потока
        thread.start(); // старт потока

        Thread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new OtherThread());
        thread2.start();

        for (int i = 0; i < 5; i++) {
            Thread thread3 = new Thread(new OtherThread());
            thread3.setName("T-" + i);
            thread3.start();
        }*/

      /*  Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running " + Thread.currentThread().isAlive());
                System.out.println("Running " + Thread.currentThread().getState());
            }

            });

        System.out.println("Before start " + thread4.isAlive());
        System.out.println("Before start " + thread4.getState());

        thread4.start();
        // ождиание, пока поток завершится
        thread4.join();
        System.out.println("After join " + thread4.isAlive());
        System.out.println("After join " + thread4.getState());*/

    /*
      Thread thread5 = new Thread(new Runnable() {
          @Override
          public void run() {
              while (true) {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
      });

      thread5.start();*/


    /*  Thread thread6 = new Thread(new Runnable() {
          @Override
          public void run() {
              while (true) {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
      });*/

    /*  thread6.setDaemon(true);
      thread6.start();
      */
      // остановка потоков
        // 1. поток выполинл все инстрц=укции и вышел из метода
        // 2. в методе run было выброшено необрабатываемое исключение
        // 3. оатсвноилась работа JVM
        // 4. это был daemon поток и последний основной поток завершил свою работу

        //механизм прерываний
            Thread thread7 = new Thread(new Runnable() {
          @Override
          public void run() {
              while (!Thread.currentThread().isInterrupted()) {
                  try {
                      System.out.println("thread7");
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      //Thread.currentThread().interrupt();
                      System.out.println("InterruptedException");
                      e.printStackTrace();
                  }
              }
          }
      });

            thread7.start();
          //  Thread.sleep(2000);
        System.out.println(thread7.isInterrupted());
      thread7.interrupt();





        // Программа будет работать, пока есть незавершенные потоки
        // Это касается ОСНОВЫНХ потоков
        // Потоки, отмеченные как daemon будут остановлены, сразу после последнего основного потока

}
// для создания своего потока нужно унаследовать класс от Thread
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread " + Thread.currentThread().getName());
    }
}
// либо реализовать интерфейс Runnable
class OtherThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
        System.out.println("Running " + Thread.currentThread().getState());
    }
    }

    }



