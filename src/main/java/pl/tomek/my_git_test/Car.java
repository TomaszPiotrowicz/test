package pl.tomek.my_git_test;

public class Car {


    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
