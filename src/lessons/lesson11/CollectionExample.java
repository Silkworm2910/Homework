package lessons.lesson11;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //Java Collection Framework
        //java.util.Collection
     /*   boolean add(E e);
        boolean remove(Object o);
        int size();
        boolean isEmty();
        boolean contains (Object o);*/

    // Object[] toArray[]; через объект
    // <T> T[] toArray(T[] a); через дженерики
        //   Srting[] arr = collectionName.toArray(new String[0]);

        //iterator()

    //    java.util.List
        // предоставляет методы для работы с коллекцией, которая является списком
 //       void add (int ind, E obj);
   //     boolean addAll(int ind, Collection<? extends E> col);
     //   E get (int ind);
       // int indexOf(Object o);
        //int lastIndexOf(Object o);

   //     E remove (int ind);
  //      E set (int ind, E obj);
   //    List<E> subList (int start, int end);

      //Set дублирующиеся элементы н ехранит

        //ArrayList // динамич массив, длина не фиксирована, может хранить все типы данных
        ArrayList<String> strList = new ArrayList<>();
//        strList.ensureCapacity(20);
  //      strList.trimToSize();
        strList.add("Elem 1");
        strList.add("Elem 2");
        strList.add(0, "Elem 2");
        //удаление элементов
       // strList.remove(индекс);
        //strList.remove(значение);

        System.out.println(strList.toString());
        Integer[] integers = {23, 67, 12, 90};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(integers));
        System.out.println(intList.toString());

        for (Integer i: intList) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = intList.iterator();//доступен всем колл-ям, hasNext возвращает либо true либо false, next - сам элеент
        while (iterator.hasNext()) {
          //  System.out.println("iterator" +iterator.next());
            if (iterator.next() == 12) {
                iterator.remove();

            }
        }

        System.out.println(intList.toString());

        //LinkedList

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.add("String 1");
        strLinkedList.add("String 2");
        strLinkedList.add("String 3");
        strLinkedList.add(1, "String 4");

        for(String str: strLinkedList) {
            System.out.println(str);
        }

        //удаление элементов
     /*   strLinkedList.poll();//null
        strLinkedList.pollFirst();//null
        strLinkedList.remove();//NoSuchElementException
        strLinkedList.removeFirst();//NoSuchElementException*/

     String[] arr1 = strLinkedList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr1));

       // HashSet
       // SortedSet -> TreeSet
        // LinkedHashSet

        HashSet<String> hashSet = new HashSet<>();//сама упорядочивает
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");
        hashSet.add("Element 3");
        System.out.println(hashSet.toString());

        TreeSet<String> treeSet = new TreeSet<>();//упорядочивает по возрастанию
        treeSet.add("Element 2");
        treeSet.add("Element 1");
        treeSet.add("Element 3");
        System.out.println(treeSet.toString());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();//упорядочивает по поряду добавления
        linkedHashSet.add("Element 2");
        linkedHashSet.add("Element 1");
        linkedHashSet.add("Element 3");
        System.out.println(linkedHashSet.toString());



    }
}
