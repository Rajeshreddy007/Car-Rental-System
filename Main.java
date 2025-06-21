import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();
        Admin admin = new Admin();
        User user = new User();

        boolean runApp = true;

        while (runApp) {
            System.out.println("\n--- Car Rental System ---");
            System.out.println("1. Admin Page");
            System.out.println("2. User Page");
            System.out.println("3. Exit");
            System.out.print("Choose any one option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    admin.manageCars(carList, sc); 
                    break;

                case 2:
                    if (carList.isEmpty()) {
                        System.out.println("No cars available. Please ask admin to add cars.");
                    } else {
                        user.userDetails(carList, sc);
                    }
                    break;

                case 3:
                    runApp = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
