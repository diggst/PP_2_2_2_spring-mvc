package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String model;
    private int code;

    public Car() {}

    public Car(String brand, String model, int code) {
        this.brand = brand;
        this.model = model;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
