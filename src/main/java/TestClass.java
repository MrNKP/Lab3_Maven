import java.util.List;

public class TestClass {
    protected long start;
    protected long finish;
    private long spent;
    protected int amount;
    protected List<Integer> array;

    public TestClass(List<Integer> mas) {
        array = mas;
    }

    void startTime() {
        start = System.currentTimeMillis();
    }

    void finishTime() {
        finish = System.currentTimeMillis();
        spent = finish - start;
    }

    public long spentTime() {
        return spent;
    }

    public void makeTest(int count, String operation) {
        amount = count;

        if ("add".equals(operation)) {
            addTest();
        } else if ("del".equals(operation)) {
            delTest();
        }
    }

    public void addTest() {
        for (int i = 1; i <= amount; i++) array.add(i);
    }

    public void delTest() {
        for (int i = 1; i <= amount; i++) array.remove(i);
    }
}

