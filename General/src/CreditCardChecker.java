public class CreditCardChecker {

    public static void CreditCardCheck(int creditCardNumber)
    {
        int n1 = 0;
        int n2 = 0;

        int i = 0;
        for (i=0; i<4; i++)
        {
            n1 += creditCardNumber % 10;
            creditCardNumber = creditCardNumber / 10;
            n2 += 2 * (creditCardNumber % 10);
            creditCardNumber = creditCardNumber / 10;
        }
        if (n1 + n2 == 50)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Checker is off by: " + Math.abs(n1 + n2 - 50));
        }

    }

}
