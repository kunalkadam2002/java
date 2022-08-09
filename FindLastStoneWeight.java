import java.util.Arrays;

public class FindLastStoneWeight {
	// Knapsacks Dp
	// O(n * sum) time and O(n) space
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        
        int sum = 0;
        
        for(int stone : stones){
            sum += stone;
        }
        
        // Only need to go till half of the total sum
        int[] dp = new  int[sum / 2 + 1];
        
        // For each stones from left to right
        for(int i = 1; i <= n; i++){
            for(int j = sum / 2; j >= stones[i - 1]; j--){
            	// This will get the biggest stone everytime after smashing two stones
                dp[j] = Math.max(dp[j], dp[j - stones[i - 1]] + stones[i - 1]);
            }
        }
        
        // dp[sum/2] will get whatever smashed
        return sum - 2 * dp[sum / 2];
    }
    
    // With 2D array instead of 1D array
    public int lastStoneWeight2(int[] stones) {
        int n = stones.length;
        
        int sum = 0;
        
        for(int stone : stones){
            sum += stone;
        }
        
        int[][] dp = new  int[n + 1][sum / 2 + 1];
        
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sum / 2; j++){
                if(j >= stones[i - 1]){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i - 1]] + stones[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return sum - 2 * dp[n][sum / 2];
    }


   public static void main(String[] args) {
		int[] stones = {4,6,2,6,3};
		
		System.out.println("Stones: " + Arrays.toString(stones));
		
		FindLastStoneWeight solution = new FindLastStoneWeight();
		
		System.out.println("Solution: " + solution.lastStoneWeight(stones));
}
}



	