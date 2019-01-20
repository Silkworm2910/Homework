package hw.hw141218.pizza;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {

    BlockingQueue<Order> queue1 = new LinkedBlockingQueue<>();
    BlockingQueue<Order> queue2 = new LinkedBlockingQueue<>();
    BlockingQueue<Order> queue3 = new LinkedBlockingQueue<>();

    public Restaurant()

    {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Client()).start();
        }
        new Thread(new Waiter()).start();
        new Thread(new Cook()).start();
    }


        class Client implements Runnable {

            @Override
            public void run() {
                try {
                    queue1.put(new Order("Order", Thread.currentThread().getName()));
                    System.out.println(Thread.currentThread().getName() + " сделал заказ");

                    Thread.sleep(10_000);

                    boolean flag = true;
while (flag) {
                    while (!queue3.isEmpty()) {
                        Order order;
                        if ((order = queue3.take()).clientID.equals(Thread.currentThread().getName())) {
                            System.out.println("Клиент " + Thread.currentThread().getName() + " забрал свой заказ");
                            flag = false;
                        } else {
                            queue3.put(order);
                            Thread.sleep(1000);
                        }
                    }

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        class Waiter implements Runnable {
            @Override
            public void run() {
                    try {
                        if (queue1.isEmpty()) {
                            Thread.sleep(1000);
                        }

                        while (!queue1.isEmpty()) {
                            Order order;
                            order = queue1.take();
                            System.out.println("Официант принял заказ для клиента " + order.getClientID());
                            queue2.put(order);
                            System.out.println("Заказ клиента " + order.getClientID() + " передан повару");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

            class Cook implements Runnable {

                @Override
                public void run() {
                    try {
                        if (queue2.isEmpty()) {
                            Thread.sleep(1000);
                        }
                        while (!queue2.isEmpty()) {
                            Order order;
                            order = queue2.take();
                            System.out.println("Повар готовит заказ для клиента " + order.getClientID());
                            Thread.sleep(2000);
                            queue3.put(order);
                            System.out.println("Заказ клиента " + order.getClientID() + "  готов");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


