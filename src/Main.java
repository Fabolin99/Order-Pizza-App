import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Display The Menu");
            System.out.println("2. Create Your Pizza");
            System.out.println("3. Leave a review");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Display Menu selected");
                    Menu menu = new Menu();
                    menu.displayMenu();
                }

                case 2 -> {
                    System.out.println("Create Your Pizza selected");
                    {
                        Pizza pizza = new Pizza();
                        pizza.addExtraCheese();
                        pizza.addExtraToppings();
                        pizza.delivery();
                        pizza.getBill();
                    }
                }

                case 3 -> {
                    System.out.println("Leave a review selected");
                    {
                        Review review = new Review();
                        review.leaveReview();
                        review.displayReviews();
                    }
                }

                // Exit the program
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        }
        while (choice != 0);
        scanner.close();
    }
}
