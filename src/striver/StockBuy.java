package striver;

public class StockBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,6,4,3,1};
		System.out.print(maxProfit1(prices));
	}
//naive approach
	static int maxProfit1(int[] prices) {
		int max_profit=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    int profit=prices[j]-prices[i];
                    if(profit>max_profit){
                        max_profit=profit;
                    }
                }
                
            }
        }
        
        
        return max_profit;
	}

	

//best  approach	
	static int maxProfit(int[] prices) {
		int min=Integer.MAX_VALUE,max=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<min)
				min=prices[i];
			int profit=prices[i]-min;
			if(max<profit)
				max=profit;
		}
		return max;
	}

}
