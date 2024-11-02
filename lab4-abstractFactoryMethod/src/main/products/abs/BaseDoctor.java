package main.products.abs;

public abstract class BaseDoctor {
    protected String name;

    public BaseDoctor(String name) {
        this.name = name;
    }

    public BaseDoctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
