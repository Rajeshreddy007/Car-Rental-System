public class Car {
    private String car_id;
    private String car_name;
    private String car_model;
    private int base_price;
    private boolean isAvailable;

    public String getCar_id() {
        return car_id;
    }
    
    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public int getBase_price() {
        return base_price;
    }

    public void setBase_price(int base_price) {
        this.base_price = base_price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Car ID: " + car_id +
               ", Name: " + car_name +
               ", Model: " + car_model +
               ", Base Price/Day: (INR)" + base_price +
               ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
