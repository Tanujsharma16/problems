public class write {
    int number = 10;
    public void show() {
        int number = 20;
        System.out.println("Local variable: " + number);       
        System.out.println("Instance variable: " + this.number);
        int x; 
    }
    public static void main(String[] args) {
        write obj = new write();
        obj.show();
    }
}

