import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review {
    private List<String> reviews;
    Scanner scanner = new Scanner(System.in);

    public Review() {
        reviews = new ArrayList<>();
    }

    public void leaveReview() {
        String userChoice = "";
        while (!userChoice.equals("y") && !userChoice.equals("n")) {
            System.out.println("Would you like to leave a review? (y/n)");
            userChoice = scanner.nextLine();
            if (userChoice.equals("y")) {
                System.out.print("Enter your review: ");
                String review = scanner.nextLine();
                reviews.add(review);
                System.out.println("Thank you for your review!");
            } else if (userChoice.equals("n")) {
                return;
            }
            else {
                System.out.println("Please, Select a Valid Option.");
            }
        }
    }

    public void displayReviews()
    {
        String userChoice = "";
        while (!userChoice.equals("y") && !userChoice.equals("n")) {
            System.out.println("Would You Like to Display Your Review? (y/n)");
            userChoice = scanner.nextLine();
            if (userChoice.equals("y")) {
                System.out.println("Review:");
                    if (reviews.isEmpty()) {
                        System.out.println("No Reviews Available.");
                    } else {
                        for (String review : reviews) {
                            System.out.println("- " + review);
                        }
                    }
            }
            else if (userChoice.equals("n")) {
                return;
            }
            else {
                System.out.println("Please, Select a Valid Option.");
            }
        }
    }
}

