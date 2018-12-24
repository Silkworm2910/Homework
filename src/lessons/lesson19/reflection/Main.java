package lessons.lesson19.reflection;

import java.awt.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws
            NoSuchFieldException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException {
        //каждый загруженный класс имеет соответствующий java.lang.Class объект,
        //который дает доступ к структуре класса

        //у каждого типа есть свой литерал class
        System.out.println(String.class);
        System.out.println(int.class);

        Child child = new Child("str", 2);
        Child child2 = new Child("str", 2);
        // строковый литерал объекта
        System.out.println(child.getClass());
        // строковый литерал класса-наследника

        Class cls;
        cls = child.getClass();
        System.out.println("child name " + cls.getName());

        cls = cls.getSuperclass();
        System.out.println("child extends " + cls.getName());

        // доступ к компонентам

        // класс объекта
        Class<Child> childClass = Child.class;

        // доступ к полям
        Field[] fields = childClass.getFields();
        System.out.println(Arrays.toString(fields));

        // доступ к declared полям
        Field[] declaredFields = childClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        // доступ к методам
        Method[] methods = childClass.getMethods();
        System.out.println(Arrays.toString(methods));

        Method[] declaredMethods = childClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        // доступ к конструкторам
        Constructor<?>[] declaredConstructors = childClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

        // доступ к конкретному полю, методу, конструктору
        Field field = childClass.getDeclaredField("name");
        // получить доступ к полю
        field.setAccessible(true);
        field.set(child, "CHILD");
        System.out.println((String) field.get(child));
        System.out.println(child);

        // получить доступ к методу
        Method method = childClass.getDeclaredMethod("getInfo");
        method.setAccessible(true);
        String data = (String) method.invoke(child);
        System.out.println(data);

        //доступ к конструктору
       // Constructor<Child> childConstructor = childClass.getDeclaredConstructor();
        //создание объекта
        Constructor<Child> childConstructor = childClass.getDeclaredConstructor(String.class, int.class);
        Child child1 = childConstructor.newInstance("CHILD 1", 3);
        System.out.println(child1);
        //child1.

        boolean isFinal = Modifier.isFinal(field.getModifiers());
        boolean isPrivate = Modifier.isPrivate(field.getModifiers());

        Class<?>[] Interfaces = childClass.getInterfaces();

    }
}
