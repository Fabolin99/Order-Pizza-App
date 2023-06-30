import java.util.Scanner;

public class Pizza
{
    Scanner scanner = new Scanner(System.in);
    private int price;
    private Boolean vegetarian;
    private int extraCheesePrice = 3;
    private int extraToppingsPrice = 4;
    private int deliveryFee = 8;

    public Pizza()
    {
        String userChoice = "";
        while (!userChoice.equals("y") && !userChoice.equals("n"))
        {
            System.out.println("Is This a Vegetarian Pizza? (y/n)");
            userChoice = scanner.nextLine();
            if (userChoice.equals("y")) {
                System.out.println("Vegetarian Pizza Added.");
                this.price += 23;
            } else if (userChoice.equals("n")) {
                this.price = 18;
            } else {
                System.out.println("Please, Select a Valid Option");
            }
        }
    }
     public void  getPizzaPrice()
     {
         System.out.println(this.price);
     }

     public void addExtraCheese()
     {
         String userChoice = "";
         while (!userChoice.equals("y") && !userChoice.equals("n"))
         {
             System.out.println("Would You Like To Add Extra Cheese? (y/n)");
             userChoice = scanner.nextLine();
             if (userChoice.equals("y")) {
                 System.out.println("Extra Cheese Added.");
                 this.price += extraCheesePrice;
             } else if (userChoice.equals("n")) {
                 return;
             } else {
                 System.out.println("Next Time, Select a Valid Option");
             }
         }
     }

     public void addExtraToppings()
     {
         String userChoice = "";
         while (!userChoice.equals("y") && !userChoice.equals("n"))
         {
             System.out.println("Would You Like To Add Extra Toppings? (y/n)");
             userChoice = scanner.nextLine();
             if (userChoice.equals("y")) {
                 System.out.println("Extra Toppings Added.");
                 this.price += extraToppingsPrice;
             } else if (userChoice.equals("n")) {
                 return;
             } else {
                 System.out.println("Next Time, Select a Valid Option");
             }
         }
     }

     public void delivery()
     {
         String userChoice = "";
         while (!userChoice.equals("y") && !userChoice.equals("n"))
         {
             System.out.println("Is This a Delivery Order? (y/n)");
             userChoice = scanner.nextLine();
             if (userChoice.equals("y")) {
                 System.out.println("Delivery Included.");
                 this.price += deliveryFee;
             } else if (userChoice.equals("n")) {
                 return;
             } else {
                 System.out.println("Next Time, Select a Valid Option");
             }
         }
     }
     public void getBill()
     {
         System.out.printf("The total is: $%d", this.price);
     }
}
