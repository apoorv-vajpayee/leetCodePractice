class Solution {
    public int coinChange(int[] coins, int amount) {
        
       Arrays.sort(coins);
       int[] answers = new int[amount+1];
        Arrays.fill(answers, amount+1);
        answers[0] = 0;
        for(int i=0; i<= amount; i++){
            for(int coin=0; coin<coins.length; coin++){
                if(coins[coin]<=i){
                answers[i] = Math.min(answers[i], 1+answers[i-coins[coin]]);
                }
                else{
                    break;
                }
            }
        }
        return answers[amount] > amount ? -1 : answers[amount];
    }
}
