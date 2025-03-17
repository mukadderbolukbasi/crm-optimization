package crm.optimization;

import crm.optimization.models.*;
import crm.optimization.algorithms.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ali", "İstanbul", 3));
        customers.add(new Customer("Zeynep", "Ankara", 5));
        customers.add(new Customer("Mert", "İstanbul", 2));

        List<SupportRepresentative> representatives = new ArrayList<>();
        representatives.add(new SupportRepresentative("Ahmet", "İstanbul", true));
        representatives.add(new SupportRepresentative("Ayşe", "Ankara", true));

      
        System.out.println("Müşteri destek temsilcisi atamaları:");
        SupportAssignment.assignRepresentatives(customers, representatives);

    
        List<MarketingCampaign> campaigns = new ArrayList<>();
        campaigns.add(new MarketingCampaign("Google Ads", 5000, 12000));
        campaigns.add(new MarketingCampaign("Instagram Reklam", 3000, 8000));
        campaigns.add(new MarketingCampaign("YouTube Sponsor", 7000, 15000));

        int budget = 10000;

        System.out.println("\nPazarlama kampanyası optimizasyonu:");
        MarketingOptimization.optimizeCampaigns(campaigns, budget);
    }
}
