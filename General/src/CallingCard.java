/**
 A CallingCard object has a name inherited from Card,
 and in addition it has a card number and a PIN.
 */
public class CallingCard extends Card

{
    private String cardNumber, pin ;
    /**
     Constructs a CallingCard object with empty string name.
     */
    public CallingCard()
    {
        super("");
    }
    /**
     Constructs a CallingCard object with given name
     @param name1 the given name
     */
    public CallingCard(String name1)
    {
        super(name1);
    }
    /**
     Gives a String format for the card
     @return the formatted String representing this card
     */
    public String format()
    {
        return null;
    }
}

