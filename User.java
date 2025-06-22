import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class UserInfo {
    private String cusId;
    private String cusName;
    private int cusAge;

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getCusAge() {
        return cusAge;
    }

    public void setCusAge(int cusAge) {
        this.cusAge = cusAge;
    }
}

public class User {
    public void userDetails(List<Car> carList, Scanner sc, List<RentalRecord> rentalList){
        System.out.println("--- Welcome to User Page ---");
        List<UserInfo> userList = new ArrayList<>();
        boolean status = true;

        while (status) {
            System.out.println("\nMenu:");
            System.out.println("1. Rent Car");
            System.out.println("2. Return Car");
            System.out.println("3. Exit");
            System.out.print("Choose any one option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Rent Car
                    UserInfo ui = new UserInfo();
                    System.out.print("Enter Customer ID: ");
                    ui.setCusId(sc.next());

                    System.out.print("Enter Customer Name: ");
                    ui.setCusName(sc.next());

                    System.out.print("Enter Customer Age: ");
                    int age = sc.nextInt();

                    if (age <= 18) {
                        System.out.println("You must be above 18 years old to rent a car.");
                        break;
                    }

                    ui.setCusAge(age);
                    userList.add(ui);

                    boolean available = false;
                    for (Car c : carList) {
                        if (c.isAvailable()) {
                            available = true;
                            break;
                        }
                    }

                    if (!available) {
                        System.out.println("No cars available for rent.");
                        break;
                    }

                    System.out.println("\n--- Available Cars ---");
                    for (Car c : carList) {
                        if (c.isAvailable()) {
                            System.out.println(c);
                        }
                    }

                    System.out.print("Enter Car ID to rent: ");
                    String rentId = sc.next();
                    boolean found = false;

                    for (Car c : carList) {
                        if (c.getCar_id().equals(rentId) && c.isAvailable()) {
                            System.out.print("Enter number of days to rent: ");
                            int days = sc.nextInt();
                            int total = c.getBase_price() * days;

                            System.out.println("Car Rented Successfully: " + c.getCar_name());
                            System.out.println("Total Amount for " + days + " days: " + total);
                            RentalRecord record = new RentalRecord(
                            ui.getCusId(), ui.getCusName(), ui.getCusAge(),
                            c.getCar_id(), c.getCar_name(), days, total
                            );
                            rentalList.add(record);
                            c.setAvailable(false);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Car ID not found or already rented.");
                    }
                    break;

                case 2: // Return Car
                    boolean anyRented = false;
                    for (Car c : carList) {
                        if (!c.isAvailable()) {
                            anyRented = true;
                            break;
                        }
                    }

                    if (!anyRented) {
                        System.out.println("No cars are currently rented.");
                        break;
                    }

                    System.out.println("\n--- Rented Cars ---");
                    for (Car c : carList) {
                        if (!c.isAvailable()) {
                            System.out.println(c);
                        }
                    }

                    System.out.print("Enter Car ID to return: ");
                    String returnId = sc.next();
                    boolean returned = false;

                    for (int i = 0; i < carList.size(); i++) {
                    Car c = carList.get(i);
                    if (c.getCar_id().equals(returnId) && !c.isAvailable()) {
                        c.setAvailable(true);
                        // Remove from rental record
                        RentalRecord toRemove = null;
                        for (RentalRecord r : rentalList) {
                            if (r.getCarId().equals(returnId)) {
                                toRemove = r;
                                break;
                            }
                        }
                        if (toRemove != null) {
                            rentalList.remove(toRemove);
                        }

                        System.out.println("Car returned successfully: " + c.getCar_name());
                        returned = true;
                        break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Car ID not found or already returned.");
                    }
                    break;

                case 3:
                    status = false;
                    System.out.println("--- Exit Successfully ---");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
