public class RentalRecord {
    private String customerId;
    private String customerName;
    private int customerAge;
    private String carId;
    private String carName;
    private int days;
    private int totalPrice;

    public RentalRecord(String customerId, String customerName, int customerAge,
                        String carId, String carName, int days, int totalPrice) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.carId = carId;
        this.carName = carName;
        this.days = days;
        this.totalPrice = totalPrice;
    }
    public String getCarId() {
    return carId;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + customerName + ", Age: " + customerAge +
               ", Car ID: " + carId + ", Car Name: " + carName +
               ", Days: " + days + ", Total Price: " + totalPrice;
    }
}
