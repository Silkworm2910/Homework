/*
package lessons.lesson26needtopull;

public class Bank {
    public  static  void transfer(Account src, Account dst, int money) {
        Account obj1;
        Account obj2;

        if (src.getID() < dst.getID()) {
            obj1 = src;
            obj2 - dst;
        } else {
            obj1 = dst;
            obj2 = src;
        }

        synchronized (obj1) { // src // dst
            synchronized (obj2) { // dst // src
                // перевод money
            }
        }
    }

    public static void main(String[] args) {
        transfer(1, 2, 500);
        transfer(2, 1, 700);
    }
}
*/
