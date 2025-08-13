 public class cylinder{   
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int radius= sc.nextInt();
       int height= sc.nextInt();

        System.out.println("Area of cylinder is: " + (2 * Math.PI * radius * (radius + height)));
    }
   }
