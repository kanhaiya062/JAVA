import java.util.Scanner;

    public class find_cost_sing_condition  {
        public static void main(String[] args) {
            // Define the cost per unit
            int costPerUnit = 100;
    
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
    
            // Ask the user for the quantity
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
    
            // Calculate the total cost without discount
            int totalCost = costPerUnit * quantity;
    
            // Check if the total cost is more than 1000 to apply the discount
            if (totalCost > 1000) {
                // Calculate the discounted cost (10% discount)
                double discountedCost = totalCost * 0.9;
                System.out.println("Total cost with a 10% discount: $" + discountedCost);
            } else {
                System.out.println("Total cost without discount: $" + totalCost);
            }
    
            // Close the scanner
            scanner.close();
        }
    }
    
    

