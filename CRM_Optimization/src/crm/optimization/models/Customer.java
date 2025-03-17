package crm.optimization.models;

public class Customer {
    private String name;
    private String city;
    private int requestLevel;

    public Customer(String name, String city, int requestLevel) {
        this.name = name;
        this.city = city;
        this.requestLevel = requestLevel;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getRequestLevel() {
        return requestLevel;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', city='" + city + "', requestLevel=" + requestLevel + "}";
    }
}
