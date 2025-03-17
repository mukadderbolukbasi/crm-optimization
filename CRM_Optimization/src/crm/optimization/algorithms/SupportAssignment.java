package crm.optimization.algorithms;

import crm.optimization.models.Customer;
import crm.optimization.models.SupportRepresentative;

import java.util.List;

public class SupportAssignment {
    
    public static void assignRepresentatives(List<Customer> customers, List<SupportRepresentative> representatives) {
        for (Customer customer : customers) {
            SupportRepresentative bestRep = null;
            
            for (SupportRepresentative rep : representatives) {
                if (rep.isAvailable() && rep.getCity().equals(customer.getCity())) {
                    bestRep = rep;
                    break;
                }
            }
            
            if (bestRep != null) {
                bestRep.setAvailable(false); 
                System.out.println(customer.getName() + " müşterisine " + bestRep.getName() + " atanmıştır.");
            } else {
                System.out.println(customer.getName() + " için uygun temsilci bulunamadı.");
            }
        }
    }
}
