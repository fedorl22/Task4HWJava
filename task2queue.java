// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;

public class task2queue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        String str = new String("Hello World!");
        queue.add("BB"); 
        queue.add("77");
        queue.add("22");
        queue.add("1");
        queue.add("0");
        queue.add(str);
        queue.add("AAAA");
        queue.add("cc2");
        queue.add("bb-bb");
        queue.add("da43");
        System.out.println(queue);
        System.out.println("Передний           элемент    " + first(queue));
        System.out.println("Размер   очереди              " + queue.size());
        System.out.println();

        enqueue(queue, str);
        System.out.println("Размер  очереди изменился на  " + queue.size());
        System.out.println(queue);
        System.out.println();
        
        dequeue(queue);
        System.out.println(queue);
        System.out.println("Передний элемент изменился на " + first(queue));
        System.out.println("Размер очереди  изменился  на " + queue.size());
        System.out.println();
    }

    public static LinkedList<String> enqueue(Queue<String> lst, String value) {
        ((LinkedList<String>) lst).addLast(value);
        return (LinkedList<String>) lst;

    }

    public static String dequeue(Queue<String> lst) {
        String s = lst.peek();
        System.out.println("Передний элемент " + lst.peek() + " удален");
        ((LinkedList<String>) lst).removeFirst();
        return s;
    }

    public static String first(Queue<String> lst) {
        String s = lst.peek();
        // System.out.println("Передний элемент " + lst.peek());
        return s;
    }
}