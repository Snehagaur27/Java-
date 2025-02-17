public class ProfitCalculator {
    public static void main(String[] args) {
        // Declare variables for cost price and sell price
        double costPrice = 100.0; // Example cost price (you can change this value)
        double sellPrice = 120.0; // Example sell price (you can change this value)

        // Calculate profit
        double profit = sellPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display profit percentage
        System.out.println("Profit percentage: " + profitPercentage + "%");
    }
}