import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args)
    {
        /*
        How many items are you purchasing? 3
Price of item 1? 1.5
Price of item 2? 3.1
Price of item 3? 0.5
Your cart has 3 items with a total cost of $5.1
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int itemCount = sc.nextInt();
        double total = 0.0;
        for(int j = 1; j < itemCount + 1; j++)
        {
            System.out.print("Price of item " + j + "? ");
            double itemCost = sc.nextDouble();
            total += itemCost;
        }
        System.out.print("Your cart has " + itemCount + " items with a total cost of $" + total);
        // TODO: Ask the user how many items they are purchasing
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}
