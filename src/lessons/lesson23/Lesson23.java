package lessons.lesson23;

import chat.Message;

import java.util.concurrent.*;

public class Lesson23 {
    public static void main(String[] args)
            throws
            ExecutionException,
            InterruptedException {
        //java.util.concurrent.Callable - возвращает данные из потока
        //java.util.concurrent.Future
        // get() get(long 1, TimeUnit tu)
        // cancel() - отменяет текущую задачу
        //isCancelled()
        //isDone()

       // FutureTask
                //new FutureTask(Callable<T> c)
                //new FutureTask(Runnable r,T result);

        FutureTask<String> task = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "String";
            }
        });

        new Thread(task).start();
        // ждем завершения операции
        String result = task.get();
        System.out.println(result);

        FutureTask<String> task1 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                int counter = 0;
                while (!Thread.currentThread().isInterrupted()
                && counter < 3)
                {
                    counter++;
                    Thread.sleep(1000);
                }
                return "Finished";
            }
        });
        // запускаем поток с задачей
        new Thread(task1).start();
        Thread.sleep(2000);
        // прерываем выполнение
        task1.cancel(true);

        System.out.println(task1.isCancelled());
        System.out.println(task1.isDone());

        //interface Executor позволяет управлять группой потоков
        // execute(Runnable runnable)

       // new Thread(task).start();
       // или
        //ExecutorService executorService; // создание объекта
        // executorService.execute(new Thread(task));

        //executorService.submit(new Thread(task1));

       // класс Exsecutors
//        Executors.newFixedThreadPool(int i)
//        Executors.newSingleThreadExecutor()
//        Executors.newCachedThreadPool()
//        Executors.newScheduledThreadPool(int i)

        ExecutorService pool = Executors.newFixedThreadPool(2);
     /*   for (int i = 0; i < 5; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("pool: " + Thread.currentThread().getName());
                }
            });*/

            // метод submit возвращает объект Future
            // соответственно ему доступны все его методы
        //Object o = null;
      //  for (int i = 0; i < 5; i++) {
            pool.submit(new Thread(task1)).get();
       // }


            pool.shutdown();

            ExecutorService service = new ThreadPoolExecutor(
                    1, // основное количество потоков
                    10, // максимальное коливество потоков
                    // как долго избыточные потоки будут простаивать
                    2,
                    TimeUnit.MINUTES,
                    new LinkedBlockingDeque<>() // очередь для задач
            );

            for (int j = 0; j < 3; j++) {
                service.submit(new Runnable() {
                    @Override
                    public void run() {
                        // код
                    }
                });
            }

          //  service.submit(new Thread(task));

        // объекты синхронизации
//        CountDownLatch(int num) // 3
//        await(); // блокировка
//        countDown(); // уменьшение счетчика
//
//        Exchanger
//        Exchanger<Message> exchanger
//                messages[4] = exchanger.exchange(messages[4]);
       // exchange(T buffer);


        }




        //Список задач
       // FutureTask futureTask = new FutureTask();

    // создать класс пользователь. у пользователя id и email
    // след. класс аккаунт. у акка id, поле Id пользователя и кол-во средств денежных
    // все id уникальны. у аккаунта инфа, какому польщователю он принадлжлеит
    // класс банк. хранит в себе список всех акков. имеет метод переводы денег transferMoney(Account src, Account dst, int amount)
    // откуда, куда, сколько
    // User, Account, Bank, Transaction
    // откуда и куда - разные
    // если средств недостаточно - то переовд быть выполнен не может
    // получение данных о состоянии счета - обязтаельно, потокобезопасно
    // Transaction класс. поток. содержит Account src, account dst, Bank bank, int amount, Date date.
    // опционально омжно добавить классы

    // + 2 из vk. одну на выбор

    }

