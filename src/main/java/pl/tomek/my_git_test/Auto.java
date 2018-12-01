package pl.tomek.my_git_test;

public class Auto {


    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
