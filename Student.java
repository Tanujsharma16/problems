import java.util.Scanner;

public class Student {
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name=name;
        this.marks=marks;}
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int marks=sc.nextInt();
        Student student = new Student("Alice", marks);
            if(student.marks>=40){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
            }
        }
}

