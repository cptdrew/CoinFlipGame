
public class Player {
    private String name = "";
    private String coinOption = "";
     
    public String[] coinValue = {"Heads", "Tails"};
     
    Player(String newName){
        name = newName;
        System.out.println("Players name is : " + getName());
    }
    
    public String getName() {
    	
    	return name;
    	
    }
    
    public String getCoinOption(){ 
    	
    	return coinOption;
    
    }
     
    // Set coinOption to the opposite of what is sent
   public void setCoinOption(String opponentFlip){
         
        coinOption = (opponentFlip == "Heads")?"Tails":"Heads";
         
    }
     
    public String getRandCoinOption(){
         
        // Get a random 0 or 1
        int randNum = (Math.random() < 0.5)?0:1;
         
        // Set the value based on the index chosen at random
        // for the array coinValue which will be either
        // Heads or Tails
        coinOption = coinValue[randNum];
        System.out.println(getName() + " chooses " + coinOption); 
        return coinValue[randNum];
                 
    }
     
    public void didPlayerWin(String winningFlip){
         
        if(coinOption == winningFlip){
             
            System.out.println(name + " won with a flip of " + coinOption);
             
        } else {
             
            System.out.println(name + " lost with a flip of " + coinOption);
             
        }
         
    }
 
}
