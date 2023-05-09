import java.util.ArrayList;

public class Digits 
{
    public Digits(int num)
    {
        ArrayList<Integer> digitList = new ArrayList<Integer>(100);
        while (num>0)
        {
            digitList.add(0, num%10);
            num /= 10;
        }
        System.out.println("digitlist = " + digitList);
    }
}
