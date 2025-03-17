package crm.optimization.algorithms;

import crm.optimization.models.MarketingCampaign;
import java.util.List;

public class MarketingOptimization {

    public static void optimizeCampaigns(List<MarketingCampaign> campaigns, int budget) {
        int n = campaigns.size();
        int[][] dp = new int[n + 1][budget + 1];

        for (int i = 1; i <= n; i++) {
            MarketingCampaign campaign = campaigns.get(i - 1);
            int cost = campaign.getCost();
            int roi = campaign.getExpectedROI();

            for (int j = 0; j <= budget; j++) {
                if (cost > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cost] + roi);
                }
            }
        }

        System.out.println("Maksimum yatırım getirisi: " + dp[n][budget]);
    }
}
