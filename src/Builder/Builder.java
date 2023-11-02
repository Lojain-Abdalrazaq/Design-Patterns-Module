package Builder;

public class Builder {
    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    public Builder id(int id) {
        this.id = id;
        return this;
    }
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }
    public Builder model(String model) {
        this.model = model;
        return this;
    }
    public Builder color(String color) {
        this.color = color;
        return this;
    }
    public Builder height(int height) {
        this.height = height;
        return this;
    }
    public Builder engine(String engine) {
        this.engine = engine;
        return this;
    }
    public Builder nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }
    public Car build() {
        return new Car(id, brand, model, color, height, engine, nbrOfDoors);
    }

}
