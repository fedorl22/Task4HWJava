// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.LinkedList;

public class task1inverted {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList<>();
        String str = new String("Hello World!");
        lst.add("77");
        lst.add("22");
        lst.add("1");
        lst.add("0");
        lst.add(str);
        lst.add("AAAA");
        lst.add("cc2");
        lst.add("bb-bb");
        lst.add("da43");
        System.out.println("Первоначальный список: " + lst);
        LinkedList reversedList = reverseLinkedList(lst);
        System.out.println("Перевернутый   список: " + reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        LinkedList reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = (String) list.get(i);
            reversedList.add(element);
        }
        return reversedList;
    }
}