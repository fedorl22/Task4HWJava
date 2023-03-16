import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Введите число: ");
            double a = input.nextDouble();
            Queue<Double> queue = new LinkedList<Double>();
            enqueue(queue, a);
            System.out.println(queue);
            while (true) {
                a = lastqueue(queue);
                System.out.printf(
                        "Введите арифметическое действие (+, -, *, /),'del' для отмены, любой символ для продолжения работы или 'ex' для выхода: : ");
                String b = input.next();
                if (b.equals("ex")) {
                    break;
                }
                if (b.equals("del")) {
                    if (queue.size() > 1) {
                        System.out.println(delastqueue(queue));
                        System.out.println("Отмена последней операции");
                        a = lastqueue(queue);
                        System.out.println("Результат:" + a);
                        
                    } else {
                        System.out.println("В памяти калькулятора осталось одно значение");
                    }
                }
                if (b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/")) {
                    System.out.printf("Введите число: ");
                    double c = input.nextDouble();
                    double res = a;
                    switch (b) {
                        case "+":
                            res = a + c;
                            break;
                        case "-":
                            res = a - c;
                            break;
                        case "*":
                            res = a * c;
                            break;
                        case "/":
                            if (c == 0) {
                                System.out.println("Деление на 0 невозможно!");
                                continue;
                            } else {
                                res = a / c;
                            }
                            break;
                    }
                    System.out.println(enqueue(queue, res));
                    System.out.print("Результат:\n");
                    System.out.println(a + " " + b + " " + c + " = " + res);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static LinkedList<Double> enqueue(Queue<Double> lst, Double value) {
        ((LinkedList<Double>) lst).addLast(value);
        return (LinkedList<Double>) lst;

    }

    public static LinkedList<Double> delastqueue(Queue<Double> lst) {
        ((LinkedList<Double>) lst).removeLast();
        return (LinkedList<Double>) lst;

    }

    public static Double lastqueue(Queue<Double> lst) {
        return ((LinkedList<Double>) lst).getLast();

    }

    public static Double first(Queue<Double> lst) {
        Double s = lst.peek();
        // System.out.println("Передний элемент " + lst.peek());
        return s;
    }
}
