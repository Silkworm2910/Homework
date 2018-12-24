package lessons.lesson22;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SomeClass {
    // чтение и запись всегда будут атомарными
    // чтение всегда вернет актуальное занчение из памяти
    public static volatile boolean run = true; //
    // private volatile Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        for (int i =0; i < 1000; i++) {
            new SomeThread().start();
        }

        Thread.sleep(3000);
        run = false;
    }

    private static class SomeThread extends Thread {
        @Override
        public void run() {
            while (run) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    run = false;
                    e.printStackTrace();
                }
            }
        }
    }

    // коллекции с синхронизированным доступом
    // Vector
    // Hashtable
    // Stack
    // StringBuffer

    // однопоточные коллекции плюс декораторы
    List<String> list = Collections.synchronizedList(new ArrayList<>());
    Set<String> set = Collections.synchronizedSet(new HashSet<>());
    Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

   // java.util.concurrent. - java 1.5

    //TimeUnit unit


    // многопоточные коллекции
   // интерфейс ConcurrentMap
    // чтение и запись всегда будут атомарными
    // операции чтения не требуют блокировки
    // операции записи могут происходить без блокировок

    // putIfAbsent(key, val)
    // remove(key,val)
    // replace(key, oldValue, newValue)

    // реализации
    // ConcurrentHashMap - блокировка на уровне сегментов
    // ConcurrentSkipListMap (Skip List алгоритм)

    // ConcurrentSkipListSet (Skip List алгоритм)
    // CopyOnWriteArrayList (много читателей и мало писателей)
    // CopyOnWriteArraySet (много читателей и мало писателей)

    //  Интерфейс BlockingQueue - блокирующие очереди
    //  Интерфейс BlockingDeque - блокирующие очереди
   /* вставка
    add(o) - Exception
    offer(o) - чтение
    put(o) - блокировка потока
    удаление
    remove() - Exception
    poll()
    take() - блокировка потока

    ArrayBlockingQueue (размер фиксирован)

        new ArrayBlockingQueue(int capacity)
        new ArrayBlockingQueue(int capacity, boolean fair)
        new ArrayBlockingQueue(int capacity, boolean fair, Collection collection)

        LinkedBlockingQueue() размер фиксирован Integer.MAX_VALUE
        LinkedBlockingQueue(int capacity)
        LinkedBlockingQueue(Collection collection)

            SynchronousQueue*/

   // используя блокирующие очереди сосчитать топ 100 слов
}