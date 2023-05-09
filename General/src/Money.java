public class Money
{
    public Money(){}
    public String money(double input)
    {
        return( (int)input + " dollars " + Math.round((input - (int)input)*100) + " cents" );

    }
}
