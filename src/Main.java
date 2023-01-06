import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        Random count = new Random();
        for (int i = 0; i < count.nextInt(5, 11); i++) {
            linkedList.addData(count.nextInt(-100, 101));
        }
        System.out.println("Список целых чисел: ");
        linkedList.forEach(System.out::println);
        System.out.println("*******************");

        MyLinkedList<String> linkedList1 = new MyLinkedList<>();
        linkedList1.addData("One");
        linkedList1.addData("Ten");
        linkedList1.addData("Two");
        linkedList1.addData("Nine");
        linkedList1.addData("Three");
        linkedList1.addData("Eight");
        linkedList1.addData("Four");
        linkedList1.addData("Seven");
        linkedList1.addData("Five!!!");
        linkedList1.addData("Six!!!");
        System.out.println("Список строк: ");
        linkedList1.forEach(System.out::println);
    }
}