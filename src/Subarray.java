import java.util.ArrayList;
import java.util.List;

public class Subarray {
    private List<Integer> prices = new ArrayList<>();

    public Subarray (List<Integer> prices){
        if (prices.size() < 2){
            throw new IllegalArgumentException();
        }
        this.prices = prices;
    }

    public List<Integer> getPrices(){
        return prices;
    }

    public int findBestDeal (){
        int max = prices.get(1);
        int min = prices.get(0);
        int bestDeal = prices.get(1) - prices.get(0);
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) < min && i != prices.size() - 1) {
                min = prices.get(i);
                max = prices.get(i + 1);
            } else {
                if (prices.get(i) > max) {
                    max = prices.get(i);
                }
            }
            if (bestDeal < (max - min)) {
                bestDeal = max - min;
            }
        }
        return bestDeal;
    }
}
