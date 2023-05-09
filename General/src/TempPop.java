import java.util.ArrayList;
import java.util.Scanner;

public class TempPop {


//Fields

    //Create a String to hold the name of a city.
    private String cityName;

    //Create an ArrayList of Integers called temps.
    ArrayList<Double> temps = new ArrayList<Double>();
    //this will store the high temperature for each month.

    //Create an ArrayList of Doubles called population
    ArrayList<Integer> population = new ArrayList<Integer>();
    //this will store population, in millions, for the last ten years
    //rounded to the nearest tenth, for the country that your selected city is in.

//Constructor
    Scanner scan = new Scanner(System.in);

    //Have the constructor take the name of the city and store it.
    public TempPop(String c)
    {
        cityName = c;
    }

//Methods

    //Look up the high temperature for an international city of your choice, using www.wunderground.com.for each month
    //of this year and add them to temps using SimpleInput.
    public void setTemps(int repeat) {
        if(repeat > 0){
            for(int i=0; i<repeat; i++){
                System.out.println("Input temp: ");
                temps.add(0, scan.nextDouble());
            }
        }
    }

    //Enter the population for the last 10 years into population using
//SimpleInput.
//You can find this information by visiting
//data.worldbank.org/indicator/SP.POP.TOTL.
    public void setPops(int repeat) {
        if(repeat > 0){
            for(int i=0; i<repeat; i++){
                System.out.println("Input pop: ");
                population.add(0, scan.nextInt());
            }
        }
    }


    //Write a method that will print out the temperatures so that each
    //individual month and temperature is on a line by itself.
    public void getTemps() {
        System.out.println("January, " + temps.get(0));
        System.out.println("Febuary, " + temps.get(1));
        System.out.println("March, " + temps.get(2));
        System.out.println("April, " + temps.get(3));
        System.out.println("May, " + temps.get(4));
        System.out.println("June, " + temps.get(5));
        System.out.println("July, " + temps.get(6));
        System.out.println("August, " + temps.get(7));
        System.out.println("September, " + temps.get(8));
        System.out.println("October, " + temps.get(9));
        System.out.println("November, " + temps.get(10));
        System.out.println("December, " + temps.get(11));
    }


    //Write a method to find the highest temperature for your city
    //and return it.
    public double getHigh() {
        double temp = temps.get(0);
        for(double elements : temps)
        {
            if(temp < elements)
            {
                temp = elements;
            }
        }
        return temp;
    }

    //Write a method to find the average high temperature for the year
    //for your city and return it.
    public double getAv() {
        double temp = 0;
        int count = 0;
        for(double elements : temps)
        {
            temp += elements;
            count ++;
        }
        return temp/count;
    }
}