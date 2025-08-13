class Counter {
    // Instance variable
    int instanceCount = 0;

    // Static variable
    static int staticCount = 0;

    Counter() {
        instanceCount++;
        staticCount++;
    }

    void display(String objectName) {
        System.out.println(objectName + " -> instanceCount: " + instanceCount + ", staticCount: " + staticCount);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        obj1.display("Object 1");

        Counter obj2 = new Counter();
        obj2.display("Object 2");

        Counter obj3 = new Counter();
        obj3.display("Object 3");
    }
}
