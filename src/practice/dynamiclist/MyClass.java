package practice.dynamiclist;

public class MyClass {
    int number = 0; // поле для нумерации объектов
    MyClass next = this; //ссылка на следующий объект

    void create(int n) {
        int i;
        MyClass objA = this;
        MyClass objB;
        for (i = 1; i <= n; i++) {   //создани =е списка
            objB = new MyClass();
            objA.next = objB;
            objB.number = objA.number + 1;
            objA = objB;
        }

        objA.next = this; // последний объект списка ссылается на начальный
    }

    int getNumber(int k) { //номер объекта в списке
        int i;
        MyClass obj = this;
        for (i = 1; i <= k; i++) obj = obj.next;
            return obj.number;
        }

    }

