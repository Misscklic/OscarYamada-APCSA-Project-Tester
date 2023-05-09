
public class Date {

    int day;
    int month;
    int year;

    public Date(int d, int m, int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public Date()
    {
        day=0;
        month=0;
        year=0;
    }

    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }


    public String toString()
    {
        return  day+ "/"+month+"/"+year;

    }
}
