import java.util.Scanner;

public class A3Q1 {
public static void main(String[] args) {
    int hindi,english,maths,physics,chemistry;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks of hindi");
    hindi=sc.nextInt();
    System.out.println("enter marks of english");
    english=sc.nextInt();
    System.out.println("enter marks of maths");
    maths=sc.nextInt();
    System.out.println("enter marks of physics");
    physics=sc.nextInt();
    System.out.println("enter marks of chemistry");
    chemistry=sc.nextInt();
    int marks= hindi+english+maths+physics+chemistry;
    int p=(100*marks)/500;
    if(p >=85)
        System.out.println("p = "+ p+"  Excellent student");
        else if(p >=70 )
        System.out.println("p = "+ p+"  Very  Good Student");
        else if(p >=55)
        System.out.println("p = "+ p+"  Good student");
        else if(p >=40)
        System.out.println("p = "+ p+"  Poor student");
        else 
        System.out.println("p = "+ p+"  Very Poor Student");
}
    
}