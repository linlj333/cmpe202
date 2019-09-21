import java.util.*;

public class GumballMachineDemo {

	public static void main(String[] args) {
	    
	      
	      
		// int quarter = 25; dime = 1; nickel = 5; 
		// int coins = 0;

		// System.out.println("Select the gumball machine: 1. Cost: 25 cents. Only quarters");
		// System.out.println("                            2. Cost: 50 cents. Only quarters");
		// System.out.println("                            3. Cost: 50 cents and accepts all coins.");

		//machine 1: 
        int insertCoins1 = 25; 
        int numberOfGumball1 = 5;
		GumballMachine gumballMachine1 = new GumballMachine(numberOfGumball1,insertCoins1);
		gumballMachine1.insertQuarter(insertCoins1);
        if(gumballMachine1.coinValue(insertCoins1) == 25){
        	gumballMachine1.turnCrank();
        }else{
        	System.out.println("Invaild coin.");
        }
		
		// machine 2: 
		int insertCoins2 = 50; 
		int numberOfGumball2 = 10; 
		GumballMachine gumballMachine2 = new GumballMachine(numberOfGumball2,insertCoins2);
		gumballMachine2.insertQuarter(insertCoins2);
        if(gumballMachine2.coinValue(insertCoins2) == 50){
        	gumballMachine2.turnCrank();
        }else{
        	System.out.println("Invaild coin.");
        }
	   

	   // machine 3:     // 如何设多次投入coin 如果initial insertcoin为50的话 那就是不是多次入coin了？？？
        int insertCoins3 = 50;
        int numberOfGumball3 = 10; 
		GumballMachine gumballMachine3 = new GumballMachine(numberOfGumball3,insertCoins3);
		gumballMachine3.insertQuarter(insertCoins3);
		gumballMachine3.insertNickel(insertCoins3);
		gumballMachine3.insertDime(insertCoins3);

        if(gumballMachine3.coinValue(insertCoins3) == 50){
        	gumballMachine3.turnCrank();
        }else{
        	System.out.println("Invaild coin.");
        }
		
	}
}
