import java.util.Scanner;

public class A3Q4{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2!=0)
                System.out.println("Weird");
            else if( n>2 && n<5 )
                System.out.println("Not Weird");
           else if(n>6 && n<20)
                System.out.println("Weird");
            else
                System.out.println("Not weird");
           
    }

}
    

