package hw.hw_bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Thread> transactions = new ArrayList<>();

    public void transferMoney(Account src, Account dst, int amount) {
        Transaction transaction = new Transaction(src, dst, amount);
        Thread thread = new Thread(transaction);
        thread.start();
        transactions.add(thread);
    }

    public ArrayList<Thread> getTransactions() {
        return transactions;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        User user1 = new User("user1@email");
        User user2 = new User("user2@email");
        User user3 = new User("user3@email");

        Account account1 = new Account(user1);
        account1.setAmount(55_617.48);
        Account account2 = new Account(user2);
        account2.setAmount(24.89);
        Account account3 = new Account(user3);
        account3.setAmount(1_899.52);

        bank.accounts.add(account1);
        bank.accounts.add(account2);
        bank.accounts.add(account3);

        bank.transferMoney(account1, account3, 40_000);
        bank.transferMoney(account2, account3, 999);
        bank.transferMoney(account1, account2, 1_999);

        for (Thread transaction  : bank.getTransactions()) {
            try {
                transaction.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}
