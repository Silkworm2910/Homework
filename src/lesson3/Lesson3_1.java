package lesson3;
import java.util.Arrays;
public class Lesson3_1 {
    public static void main(String[] args) {
    /*    //Arrays - статический класс
       int[] arr; // объявление переменной массива
       // int arr1 [];
        arr = new int [12]; //Массив со значениями по умолчанию из 12 эл-ов
        // Длина массива неизменна, если надо изменить - используем другую структуру данных
        System.out.println (Arrays.toString(arr));
        System.out.println(arr.length);

        int a = 90;
        //наполнения массива значениями при инициализации
        int [] arr3 = {2, 12, 45, 78, 34, a};
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);
        //доступ к эл-ам массива
        System.out.println(arr3[2]); //45
        System.out.println(arr3[2+2]); //
       // System.out.println(arr3[7]); // ArrayIndexOutOfBoundsException: 7
        arr3[1] = 123;
        System.out.println(Arrays.toString(arr3));

        //заполнит массив в цикле
        for (int i = 0; i < arr.length; i++)  {
                        arr[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr));

        // копирование массива
        int[] arr4 = {2, 6, 8, 3, 7, 2, 8};
        int[] arr5 = arr4; //не копирование, массив один
        int[] cloneArr4 = arr4.clone(); //полная копия
       // System.arraycopy (srcArr, int srcPos, destArr, int destPoss, int length);
        int[] arr6 = new int [4];
        //частичная копия
        System.arraycopy(arr4,0, arr6,2, 1); //ArrayIndexOutOfBoundsException
        // не совпадает дина копируемого и целевого массивов
        System.out.println(Arrays.toString(arr6));

        int[] copyArr4 = Arrays.copyOf (arr4, 12); //не ругается, если длины массивов не совпадают, но оставшиеся заполнит 0
        System.out.println(Arrays.toString(copyArr4));

        int[] copyRangeArr4 = Arrays.copyOfRange (arr4, 1, 3);// длина массива 3-1 = 2
        System.out.println(Arrays.toString(copyRangeArr4));
*/
        //перебор знаечний массива в цикле
        // for
       int[] arr4 = new int[] {2, 6, 8, 3, 8, 3, 98};
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] += 100;
        }
        System.out.println(Arrays.toString(arr4));
        for (int num: arr4) {
            System.out.println("num = " + num);
            num +=100; // не работает
        }
        System.out.println(Arrays.toString(arr4));

        //сравнение массивов
        arr4 = new int[] {2, 6, 8, 3, 8, 3, 98};
       int[] arr5 = new int[] {2, 6, 8, 3, 8, 3, 98};
        System.out.println(arr4 == arr5); //нельзя сравнивать массивы с помош=щью этого оператора false
        System.out.println(arr4.equals(arr5));// нельзя сравнивать массивы с помощью этого метода false
        //метод для сравнения:
        System.out.println(Arrays.equals(arr4, arr5));//сравнение по элементам. тут все гуд       true
        //наполняем массив нужными значениями
        int[] arr7 = new int [14];
        Arrays.fill (arr7, 233);
        System.out.println(Arrays.toString(arr7));
//сортировка
        arr7 = new int[] {34, 1, -90, 45, 72};
        Arrays.sort(arr7, 1, 4);
        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
        //поиск в массиве
        System.out.println(Arrays.binarySearch(arr7, 3));

    }
}
