
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double itemPrice, salesTax;
        int itemQuantity;
        double totalPrice;
        salesTax = 0.06625d;
        itemPrice = 12.089d;
        itemQuantity = 2;
        
        // Declare and assign a calculated totalPrice
        totalPrice = itemPrice*itemQuantity*(1+salesTax);

        // Modify message to include quantity 
        message = custName+" wants to purchase "+itemQuantity+" "+itemDesc;
        System.out.println(message);
        System.out.println("Total cost with tax is: "+totalPrice);
        
        // Print another message with the total cost
        
    }    
}
