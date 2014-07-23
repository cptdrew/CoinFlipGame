
public class Coin {
    
    private String coinOption = "";
    public String[] coinValue = {"Heads", "Tails"};
     
    Coin(){
         
	        // A random value of 0 or 1 is calculated
        // The value of coinOption is set based on
        // the random index chosen from coinValue[]
         
        //flipCoin();
         
    }
    
    public void flipCoin(){
        int randNum = (Math.random() < 0.5)?0:1;
        coinOption = coinValue[randNum];
        System.out.println("The coin was flipped and landed on: " + getCoinOption());
    }
    
    public String getCoinOption(){ return coinOption; }
    
}
