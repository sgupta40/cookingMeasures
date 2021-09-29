
/**
 * This class is to set up the basic methods for a program to
 * create a cooking measurment converter to hold and convert 
 * information about the measurments of cooking ingredients
 *
 * @author Sameer Gupta
 * @version 02/12/20
 */
public class CookingMeasures
{
    private final double ONE_CUP_TO_TEASPOONS = 48; //Constant field converting cups to teaspoons
    private final double TABLESPOON_TO_TEASPOON = 3; ////Constant field converting TableSpoons to teaspoons
    private double teaspoons; //field holding number of teaspoons
    private double tablespoons; //field holding number of tabelspoons
    private double cups; //field holsing number of cups
    
    //------------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor taking no parameters.
     * Setting all field values except constants to 0.
     */
    public CookingMeasures()
    {
        teaspoons = 0.0; //Setting teaspoons to 0
        tablespoons = 0.0; //setting tablespoons to 0
        cups = 0.0; //setting cups to 0
    }
    
    /**
     * Overloaded Constructor accepting value for number of cups.
     * calculates other fields based on number of cups.
     * 
     * @param inCups    number of cups user will later enter
     */
    public CookingMeasures(double inCups)
    {
        cups = inCups; //setting number of cups to parameter cups
        teaspoons = cups * ONE_CUP_TO_TEASPOONS; //Calculating number of teaspoons using field
        tablespoons = teaspoons / TABLESPOON_TO_TEASPOON; //Calculating number of tablespoons using teaspoons and field
    }
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    /**
     * Set Method for teaspoons.
     * This method will allow user to later change number of teaspoons.
     * 
     * @param inTeaspoons   number of teaspoons user will later enter
     */
    public void setTeaspoons(double inTeaspoons)
    {
        teaspoons = inTeaspoons; //setting variable teaspoons equal to parameter
        cups = teaspoons / ONE_CUP_TO_TEASPOONS; //Calculating number of cups absed on number of teaspoons
        tablespoons = teaspoons / TABLESPOON_TO_TEASPOON; //Calculating number of tablespoons using number of teaspoons
    }
    
    /**
     * Set Method for tablespoons.
     * This method will allow user to later change number of tablespoons.
     * 
     * @param inTablespoons    number of tablespoons user will later enter
     */
    public void setTablespoons(double inTablespoons)
    {
        tablespoons = inTablespoons; //setting variable tablespoons equals to parameter
        teaspoons = tablespoons * TABLESPOON_TO_TEASPOON; //Calcualting number of teaspoons based on number of tablespoons
        cups = teaspoons / ONE_CUP_TO_TEASPOONS; //Calculating number of cups based on number of teaspoons
    }
    
    /**
     * Set method for cups.
     * This method will allow user to later change the number of cups.
     * 
     * @param inCups2   number of cups user will later enter
     */
    public void setCups(double inCups2)
    {
        cups = inCups2; //Setting variable cups equals to parameter
        teaspoons = cups * ONE_CUP_TO_TEASPOONS; //Calculating number of teaspoons based on number of cups
        tablespoons = teaspoons / TABLESPOON_TO_TEASPOON; //Calcualting number of tablespoons based on number of teaspoons
    }
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    /**
     * Get Method simply returning a value for teaspoon field
     * 
     * @return double   number of teaspoons
     */
    public double getTeaspoons()
    {
        return teaspoons;
    }
    
    /**
     * Get method simply returning a value for tablespoon field
     * 
     * @return double   number of tablespoons
     */
    public double getTablespoons()
    {   
        return tablespoons;
    }
    
    /**
     * Get method simply returning a value for cup field
     * 
     * @return double   number of cups
     */
    public double getCups()
    {
        return cups;
    }
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    /**
     * toString method formatting output with values for each field
     * 
     * @return String   textual representation of data
     */
    public String toString()
    {
        return "Number of Cups: " + cups + "\n" + //Printing number of cups
                    "Number of Teaspoons: " + teaspoons + "\n" + //Printing number of teaspoons
                        "Number of Tablespoons: " + tablespoons; //Printing number of tablespoons
    }
}
