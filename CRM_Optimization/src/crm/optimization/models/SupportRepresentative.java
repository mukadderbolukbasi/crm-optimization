package crm.optimization.models;

public class SupportRepresentative {
    private String name;
    private String city;
    private boolean available;

    public SupportRepresentative(String name, String city, boolean available) {
        this.name = name;
        this.city = city;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "SupportRepresentative{name='" + name + "', city='" + city + "', available=" + available + "}";
    }
}
