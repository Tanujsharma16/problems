public class simple{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal= sc.nextInt();
        int rate= sc.nextInt();
        int time= sc.nextInt();
        double interest = (principal * rate * time) / 100.0;
        System.out.println("Simple Interest is: " + interest);
    }
    }
