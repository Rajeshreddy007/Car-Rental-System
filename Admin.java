import java.util.List;
import java.util.Scanner;

public class Admin {
    public void manageCars(List<Car> carList, Scanner sc, List<RentalRecord> rentalList){
            System.out.println("--- Welcome to Admin Page ---");

            boolean status = true;

            while (status) {
                System.out.println("\nMenu:");
                System.out.println("1. Enter Car Details");
                System.out.println("2. View All Cars");
                System.out.println("3. View Customer Rental Records");
                System.out.println("4. Exit");
                System.out.print("Choose any one option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Car car = new Car();
                        System.out.print("Enter Car ID: ");
                        car.setCar_id(sc.next());
                        System.out.print("Enter Car Name: ");
                        car.setCar_name(sc.next());
                        System.out.print("Enter Car Model: ");
                        car.setCar_model(sc.next());
                        System.out.print("Enter Car Base Price/day: ");
                        car.setBase_price(sc.nextInt());
                        car.setAvailable(true);
                        carList.add(car);
                        System.out.println("Car added successfully!");
                        break;

                    case 2:
                        if (carList.isEmpty()) {
                            System.out.println("No cars available.");
                        } else {
                            System.out.println("\n--- Car List ---");
                            for (Car c : carList) {
                                System.out.println(c);
                            }
                        }
                        break;
                    case 3:
                        if (rentalList.isEmpty()) {
                            System.out.println("No rental records found.");
                        } else {
                            System.out.println("\n--- Rental Records ---");
                            for (RentalRecord r : rentalList) {
                                System.out.println(r);
                            }
                        }
                        break;
                    case 4:
                        status = false;
                        System.out.println("Returning to main menu...");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
        }
    }
}
