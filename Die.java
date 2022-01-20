/**
 * Die.java serves as an die object for Craps.java
 *
 * @author landerera
 * @version 1-19-2022
 */
public class Die {
    // instance variable
    private int roll;

    /**
     * Constructor for objects of class Die 
     */
    public Die() {
        roll = 0;
    }
    /**
     * roleTwo first resets the roll to 0 and then returns the sum of two 6-sided die roles
     * @return the sum of 2 random rolls
     */
    public int roleTwo()
    {
        roll = 0;
        roll += (int)(Math.random() * 6) + (int)(Math.random() * 6) + 2;
        return roll;
    }
    /**
     * getRole returns the current role
     * @return the current role
     */
    public int getRole()
    {
        return roll;
    }

}
