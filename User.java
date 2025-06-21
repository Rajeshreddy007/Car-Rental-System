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
    public void userDetails(List<Car> carList) {
        Scanner sc = new Scanner(System.in);
            System.out.println("--- Welcome to User Page ---");

            List<UserInfo> userList = new ArrayList<>();
            UserInfo ui = new UserInfo();

            System.out.print("Enter Customer ID: ");
            ui.setCusId(sc.next());

            System.out.print("Enter Customer Name: ");
            ui.setCusName(sc.next());

            System.out.print("Enter Customer Age: ");
            ui.setCusAge(sc.nextInt());

            userList.add(ui);

            boolean status = true;

            while (status) {
                System.out.println("\nMenu:");
                System.out.println("1. Rent Car");
                System.out.println("2. Exit");
                System.out.print("Choose any one option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        boolean anyAvailable = false;
                        for (Car c : carList) {
                            if (c.isAvailable()) {
                                anyAvailable = true;
                                break;
                            }
                        }

                        if (!anyAvailable) {
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
                                c.setAvailable(false);
                                System.out.println("Car Rented Successfully: " + c.getCar_name());
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Car ID not found or not available.");
                        }
                        break;

                    case 2:
                        status = false;
                        System.out.println("--- Exit Successfully ---");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
    }
}
