import java.util.Scanner;

public class A3Q5 {
        public static void main(String[] args){
         double income,tax=0;
        Scanner sc=new Scanner(System.in);
        income=sc.nextDouble();
        if(income<250000){
            System.out.println("no tax");
        }
        
        else if(income <500000){
            System.out.println("You will pay 5%  Tax on "+income+" Income");
             tax = (income - 250000) * 0.05;
        }
        else if(income <1000000){
            System.out.println("You will pay 20%  Tax on "+income+" Income");
             tax = 12500 + (income - 500000) * 0.20;

        }
        else {
            System.out.println("You will pay 30%  Tax on "+income+" Income");
            tax = 12500 + 100000 + (income - 1000000) * 0.30;

        }
        System.out.println(tax);

    }
}
