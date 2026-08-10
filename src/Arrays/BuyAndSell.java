package src.Arrays;

/*  Problem : Best Time to Buy and Sell Stock
    Platform : LeetCode
    
    Intution: The intution is that we have to check that on second day of buy of the stock makes profit on other day or not. If it makes maximum profit than we have to return it, if not then we have to simply show that there is no profit made any other day after buying the stock.
    
    Approach: The approach is that we have to store the maximum profit in a variable. To check the maximum profit than we have to go through of all days and check the profit. We have to check if on first day of stock buy is greater than other days of buying than buy will be that price of that day. If on some day, buy is greater than profit than the profit will be equal be prices[i] - buy and then we will return the maximum profit of an array at the end of array of prices.
    
    Time Complexity: O(n)
    
    Space Complexity: O(1)*/

public class BuyAndSell {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int buyAndSell(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<n; i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            }
            else if(prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {3, 9, 1, 3, 6};
        print(nums);
        System.out.println(buyAndSell(nums));
    }
}
