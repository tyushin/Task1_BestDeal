import java.util.ArrayList;

public class Subarray {
    private ArrayList<Integer> prices = new ArrayList<>();

    public Subarray (ArrayList<Integer> prices){
        if (prices.size() < 2){
            throw new IllegalArgumentException();
        }
        this.prices = prices;
    }

    public ArrayList<Integer> getPrices(){
        return prices;
    }

    public int findBestDeal (){
        Integer max = prices.get(1);
        Integer min = prices.get(0);
        Integer bestDeal = prices.get(1) - prices.get(0);
        for (int i = 1; i < prices.size() - 1; i++) {
            if (prices.get(i) < min) {
                if (bestDeal < (max - min)) {
                    bestDeal = max - min;
                }
                min = prices.get(i);
                max = prices.get(i + 1);
            } else {
                if (prices.get(i) > max) {
                    max = prices.get(i);
                }
            }

        }
        if (prices.get(prices.size() - 1) > max){  //Проверка последнего элемента
            max = prices.get(prices.size() - 1);
        }
        if (bestDeal < (max - min)){
            bestDeal = max - min;
        }
        return bestDeal;
    }
}
