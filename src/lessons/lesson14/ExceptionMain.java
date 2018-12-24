package lessons.lesson14;


public class ExceptionMain {


    public static void voidWithCheckException(int i) throws CheckedException {
        if (i < 10){
            throw new CheckedException("Bad int format");
        }
    }

    public static void main(String[] args) {
        try {
            voidWithCheckException(7);
        } catch (CheckedException e) {
            System.out.println(e.getMessage());
            try {
                throw new  UncheckedException("UncheckedException ", e);
            } catch (UncheckedException exp){
                System.out.print("cause: " + exp.getCause());
            }
        }
    }
}
