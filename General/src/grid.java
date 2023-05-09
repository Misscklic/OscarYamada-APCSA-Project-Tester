public class grid
{
    public static void gridPrint(int y, int x)
    {
        int n = (y*10) + x;
        int counter = 0;

        for (int i1=0;i1<10;i1++)
        {
            for (int i2=0;i2<10;i2++)
            {
                counter ++;
                if (!(counter == n))
                {
                    System.out.print("[ ]");
                }
                else
                {
                    System.out.print("[X]");
                }
            }

            System.out.println("");
        }

    }
}
