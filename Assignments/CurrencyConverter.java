public class CurrencyConverter 
{

    
    public static double convertRupeesToDollars(int rupees)
 {
        double conversionRate = 0.012;
        double dollars = rupees * conversionRate;
        return dollars;
    }

    public static void main(String[] args) 
{
        int rupees = 1000; 
        double dollars = convertRupeesToDollars(rupees); 
        System.out.println(rupees + " Indian Rupees is equal to " + dollars + " American Dollars.");
    }
}