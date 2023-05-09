public class Car
{
    private String carName;
    private static int count;
    public Car()
    {
        carName = "toyota";
        count ++;
    }
    public Car(String c)
    {
        carName = c;
        count ++;
    }

    public String getCarName()
    {
        return carName;
    }
    public static int getCount()
    {
        return count;
    }
}
