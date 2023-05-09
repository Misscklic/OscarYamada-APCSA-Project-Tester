public class AdditionPattern {
    private int currentnumber;
    private int insertednumber;
    private int iterator;

    public AdditionPattern(int a, int b) {
        currentnumber = a;
        insertednumber = a;
        iterator = b;
    }

    public int currentNumber()
    {
        return currentnumber;
    }

    public void next()
    {
        currentnumber += iterator;
    }
    public void prev()
    {
        if (! (currentnumber == insertednumber) )
        {
            currentnumber -= iterator;
        }
    }
}
