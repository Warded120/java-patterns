package main.products.abs;

public abstract class BasePatient {
    protected String name;
    protected float temperature;

    public BasePatient(String name, float temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public BasePatient() {
    }

    public String getName() {
        return name;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
