package Gun35._01_Final.method;

public class Araclar {
    private String model;

    public Araclar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}
