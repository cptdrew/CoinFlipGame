import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CoinFlipGame {
	
	static final Logger log = LogManager.getLogger(CoinFlipGame.class.getName());
	
    public static void main(String[] args){
         
    	log.info("Entering application.");
    	log.warn("Entering application.");
    	log.error("Entering application.");
    	log.debug("Entering application.");
    	
    	// Create a coin game with the 2 players provided
        CoinGame theCoinGame = new CoinGame("Mark", "Tom");
         
        String usersAnswer;
         
        do {
             
            theCoinGame.startGame();
             
            System.out.println("Play Again? ");
             
            Scanner playGameAgain = new Scanner(System.in);
             
            usersAnswer = playGameAgain.nextLine();
             
        } while ((usersAnswer.startsWith("y")) || (usersAnswer.startsWith("Y")));
         
    }
    
}
