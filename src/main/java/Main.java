import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i=0; i<1000000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        TestClass comparerArrayList = new TestClass(arrayList);
        TestClass comparerLinkedList = new TestClass(linkedList);

        System.out.println("Comparer of ArrayList and Linked List");
        System.out.println("1000 operations");
        System.out.println("ArrayList   LinkedList");

        System.out.println("Add : ");
        comparerArrayList.startTime();
        comparerArrayList.makeTest(1000, "add");
        comparerArrayList.finishTime();
        long timeArrayList = comparerArrayList.spentTime();

        comparerLinkedList.startTime();
        comparerLinkedList.makeTest(1000, "add");
        comparerLinkedList.finishTime();
        long timeLinkedList = comparerLinkedList.spentTime();
        System.out.println(timeArrayList + "\t" + "\t" +  "\t" + timeLinkedList);

        System.out.println("Del : ");
        comparerArrayList.startTime();
        comparerArrayList.makeTest(1000, "del");
        comparerArrayList.finishTime();
        timeArrayList = comparerArrayList.spentTime();

        comparerLinkedList.startTime();
        comparerLinkedList.makeTest(1000, "del");
        comparerLinkedList.finishTime();
        timeLinkedList = comparerLinkedList.spentTime();
        System.out.println(timeArrayList + "\t" + "\t" +  timeLinkedList);
    }
}
