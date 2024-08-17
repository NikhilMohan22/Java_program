package Test1;

public class Petrolpricecal {


    public static void main(String[] args) {
        // Declare an array with petrol prices for 6 metro cities
        double[] petrolPrices = {105.5, 107.8, 104.3, 110.0, 102.4, 108.6}; // Example prices in Rs per liter
        
        // Calculate the average petrol price
        double total = 0;
        for (double price : petrolPrices) {
            total += price;
        }
        
        double averagePrice = total / petrolPrices.length;
        
        // Print the average petrol price
        System.out.printf("The average petrol price is: %.2f Rs per liter%n", averagePrice);
    }
}
