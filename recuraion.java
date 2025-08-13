// import java.util.*;
// public class recuraion {
// static void printInc(int n){
//     if(n==1){
//         System.out.println(1);
//         return;
//     }
//     printInc(n-1);
//     System.out.println(n);
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         printInc(n);
//     }
// }

// import java.util.*;
// public class recuraion {
// static void printInc(int n){
//     if(n==0){
//         return;
//     }
//     System.out.println(n);
//     printInc(n-1);
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         printInc(n);
//     }
// }

// import java.util.*;
// public class recuraion {
// static int printInc(int n){
//     if(n==0)return 1 ;
//     int s=printInc(n-1);
//     int a=n*s;
//     return a;
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         System.out.print(printInc(n));
//     }
// }

// import java.util.*;
// public class recuraion {
// static int f(int n){
//     if(n==0){return 0;}
//     else if(n==1){
//         return 1;
//     }
//     int fi =f(n-1)+f(n-2);
//     return fi;
    
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         System.out.println(f(n));
//     }
// }

// import java.util.*;
// public class recuraion {
// static int f(int n,int m){
//    if(m==0){
//     return 1;
//    }
//     return f(n,m-1)*n;
   
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int m= sc.nextInt();
//         System.out.println(f(n,m));
//     }
// }

// import java.util.*;
// public class recuraion {
// static void f(int n,int m){
//    if(m==1){
//     System.out.println(n);
//     return ;
//    }
//    f(n,m-1);
//    System.out.println(n*m);

// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int m= sc.nextInt();
//         f(n, m);
//     }
// }

// import java.util.*;
// public class recuraion {
// static int f(int n){
//    if(n==0){
//     return 0;
//    }
//    if(n%2==0){
//     return f(n-1)-n;
//    }
//    else{
//     return f(n-1)+n;
//    }

// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         System.out.println(f(n));
//     }
// }

// import java.util.*;
// public class recuraion {
// static int f(int x,int y){
//    if(y==0){
//     return x;
//    }
//    return f(y,x%y);

// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int x= sc.nextInt();
//         int y= sc.nextInt();
//         System.out.println(f(x,y));
//     }
// }

// import java.util.*;
// public class recuraion {
// static void f(int[] arr,int idx){
//    if(idx==arr.length){
//     return ;
//    }

//    System.out.println(arr[idx]);
//    f(arr,idx+1);
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[]= {1,2,3,4,5,6};
//         f(arr,0);
//     }
// }

// import java.util.*;
// public class recuraion {
// static int f(int[] arr,int idx){
//    if(idx==arr.length-1){
//     return arr[idx];
//    }
//    int s=f(arr,idx+1);
//    return Math.max(arr[idx],s);
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[]= {1,2,3,4,5,6};
//         f(arr,0);
//         System.out.println(f(arr,0));
//     }
// }
// import java.util.*;
// public class recuraion {
// static void f(int[] arr,int idx){
//    if(idx==arr.length){
//     return ;
//    }

//    System.out.println(arr[idx]);
//    f(arr,idx+1);
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[]= {1,2,3,4,5,6};
//         f(arr,0);
//     }
// }

// import java.util.*;
// public class recuraion {
// static int f(int[] arr,int idx){
//    if(idx==arr.length){
//     return -0;
//    }

//    int s=f(arr,idx+1);
//    return s+arr[idx];
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[]= {1,2,3,4,5,6};
//         System.out.println(f(arr,0));
//     }
// }

// import java.util.*;
// public class recuraion{
//     static boolean search(int[] arr,int n,int target,int idx){
//        if(idx>=n)return false;
//        if(arr[idx]==target)return true;
//        return search(arr, n, target, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,2,3,4,5};
//         int n=arr.length;
//         int target=sc.nextInt();
//         if(search(arr, n, target, 0)){
//             System.out.println("Found");
//         }
//         else{
//             System.out.println("Not Found");
//         }
//     }
// }

// import java.util.*;
// public class recuraion{
//     static void search(int[] arr,int n,int target,int idx){
//        if(idx>=n)return ;
//        if(arr[idx]==target){
//         System.out.println(idx);
//        }
//        search(arr, n, target, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,1,1,1,5};
//         int n=arr.length;
//         int target=sc.nextInt();
//         search(arr, n, target, 0);
//     }
// }

// import java.util.*;
// public class recuraion{
//     static String search(String s,String a,char target,int idx){
//        if(idx>=s.length())return a;
//          if(s.charAt(idx)!=target){
//             a+=s.charAt(idx);
//        }
//          return search(s, a, target, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//         char target=sc.next().charAt(0);
//         String a="";
//         String result = search(s, a, target, 0);
//         System.out.println(result);
//     }
// }

import java.util.*;
public class recuraion{
    static String search(String s,int idx){
       if(idx>=s.length())return "";
       String sma=search(s,idx+1);
         return sma+search(s, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
        System.out.println(search(s, 0));
    }
}
