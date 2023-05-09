public class NumberStuffs
{
    public static String PrimeCheck(int n)
    {
        if (n <= 1)
        {
            return "not a prime";
        }
        for (int i=2;i<=(n/2); i++)
        {
            if (n%i == 0)
            {
                return "not a prime";
            }
        }
        return "is a prime";
    }

    public static String Factors(int n)
    {
        String s = "";
        for (int i=1;i<=n;i++)
        {
            if (n%i == 0)
            {
                 s = s + i + " ";
            }
        }
        return s;
    }

}