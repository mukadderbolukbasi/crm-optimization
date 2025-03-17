package crm.optimization.models;

public class MarketingCampaign {
    private String name;
    private int cost; 
    private int expectedROI;

    public MarketingCampaign(String name, int cost, int expectedROI) {
        this.name = name;
        this.cost = cost;
        this.expectedROI = expectedROI;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getExpectedROI() {
        return expectedROI;
    }

    @Override
    public String toString() {
        return "MarketingCampaign{name='" + name + "', cost=" + cost + ", expectedROI=" + expectedROI + "}";
    }
}
