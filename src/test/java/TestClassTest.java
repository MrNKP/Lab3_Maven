import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TestClassTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void startTime() {
    }

    @Test
    public void finishTime() {
    }

    @Test
    public void spentTime() {
    }

    @Test
    public void makeTest() {
    }

    @Test
    public void addTest() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        TestClass comparerArrayList = new TestClass(arrayList);
        TestClass comparerLinkedList = new TestClass(linkedList);

        comparerArrayList.startTime();
        comparerArrayList.makeTest(1000, "add");
        comparerArrayList.finishTime();
        comparerLinkedList.startTime();
        comparerLinkedList.makeTest(1000, "add");
        comparerLinkedList.finishTime();
        assertEquals("GOOD", arrayList.size(), 1000);
        assertEquals("GOOD", linkedList.size(), 1000);
    }

    @Test
    public void delTest() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        TestClass comparerArrayList = new TestClass(arrayList);
        TestClass comparerLinkedList = new TestClass(linkedList);

        for (int i=0; i<1000000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        comparerArrayList.startTime();
        comparerArrayList.makeTest(1000, "del");
        comparerArrayList.finishTime();
        comparerLinkedList.startTime();
        comparerLinkedList.makeTest(1000, "del");
        comparerLinkedList.finishTime();
        assertEquals("GOOD", arrayList.size(), 1000000-1000);
        assertEquals("GOOD", linkedList.size(), 1000000-1000);
    }
}