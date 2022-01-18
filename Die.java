public class Die {
    private int roll;

    public Die() {
        roll = 0;
    }
    public int roleTwo()
    {
        roll = 0;
        roll += (int)(Math.random() * 6) + (int)(Math.random() * 6) + 2;
        return roll;
    }
    public int getRole()
    {
        return roll;
    }

}
