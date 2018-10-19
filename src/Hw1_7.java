public class Hw1_7 {
    public static void main(String[] args) {
        int y=448;
        int a=y/100;
        int c=y%10;
        int b=(y-a*100-c)/10;
        int w1=Math.max(a,b);
        int w2=Math.max(w1,c);
        System.out.println(w2);
        }

    }

