import java.util.Scanner;

public class A3Q2 {
        public static void main(String[] args) {
            int A,B,C,D, large;
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the first number");
            A=sc.nextInt();
            System.out.println("enter the second number");
            B=sc.nextInt();
            System.out.println("enter the third number");
            C=sc.nextInt();
            System.out.println("enter the fourth number");
            D=sc.nextInt();

            if (A<B) {
                large=B;

            }
            else large=A;

            if (large<C)
            large=C;
            
            if(large<D)
            large=D;
            System.out.println("larger number is  "+ large);


        }
}
