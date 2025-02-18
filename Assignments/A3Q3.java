import java.util.Scanner;

public class A3Q3 {
    public static void main(String[] args) {
        int age,w;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age<18){
        System.out.println("You must be at least 18 years old to donate blood");
        }
        if(age>=18){
            
        w=sc.nextInt();
        
        if(w<50){
                System.out.println("You must weightclr at least 50 kilograms to donate blood");
        }
        if(w>=50){
            System.out.println("You are eligible to donate blood");
    } 
}  
}

}
