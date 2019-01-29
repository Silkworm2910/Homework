package hw.hw_bank;

import java.util.Date;

public class Transaction implements Runnable {

   private Account src, dst;
   private Account acc1, acc2;
   private int amount;
   private Date date;

    public Transaction(Account src, Account dst, int amount) {
        this.src = src;
        this.dst = dst;
        this.amount = amount;
    }



    @Override
    public void run() {
        this.date = new Date();

        if (src == dst) {
            System.out.println(date + " Транзакция отклонена. Некорректный ввод.");
            Thread.currentThread().interrupt();
        } else if (src.getAmount() < amount) {
            System.out.println(date + " Транзакция отклонена. Недостаточно средств.");
            Thread.currentThread().interrupt();
        } else {
            if (src.getAccID() < dst.getAccID()) {
                acc1 = src;
               acc2 = dst;
            } else {
                acc1 = dst;
                acc2 = src;
            }

            synchronized (acc1) {
                synchronized (acc2) {
                    src.setAmount(src.getAmount() - amount);
                    dst.setAmount(dst.getAmount() + amount);
                    System.out.println(date + " Транзакция прошла успешно.");
                }
            }

        }

    }
}
