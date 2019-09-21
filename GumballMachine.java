public class GumballMachine
{

    private int num_gumballs;
    private int insertCoins; 
    private boolean has_quarter;
    private boolean has_nickel;
    private boolean has_dime;
    

    public GumballMachine( int size, int coin)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.insertCoins = coin; 
        this.has_quarter = false;
        this.has_nickel = false;
        this.has_dime = false;
    }

    public void insertQuarter(int coin) // check if coin if quarter
    {
        if (coin == 25)
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }

    public void insertNickel(int coin){  // check if coin is nickel
        if(coin == 5)
            this.has_nickel = true;
        else 
            this.has_nickel = false;
    }

    public void insertDime(int coin){  // check if coin is dime
        if(coin == 1)
            this.has_dime = true;
        else
            this.has_dime = false;
    }
    
    public int coinValue(int coin){  // by adding the coins value to check if it is ok to turnCrank 
            int totalValue = 0; 
            totalValue = totalValue + coin; 
            return totalValue; 
    }

    public void turnCrank()        
    {
        if(this.has_quarter || this.has_nickel || this.has_dime){

    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
                this.has_nickel = false;
                this.has_dime = false;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
    		}
    	}

    }
}

