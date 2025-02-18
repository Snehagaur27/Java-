import java.util.Scanner;

public class A2Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int n=sc.nextInt();
        System.out.println("enter a second number");
        int s=sc.nextInt();
        int t1=n;
        int t2=s;
        while  (t2!=0) {
            int temp=t2;
            t2=t1%t2;
            t1=temp;

        }
            int HCF=n;
            int LCM=(s*n)/HCF;
            System.out.println("lcm is " +LCM);
            System.out.println("HCF = " + HCF);
    }
}
