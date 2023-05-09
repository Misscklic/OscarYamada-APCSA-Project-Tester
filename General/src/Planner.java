import java.util.ArrayList;

public class Planner {

    ArrayList<Date> calender;
    ArrayList<String> assignments;

    public Planner(ArrayList<Date> c, ArrayList<String> a) {calender = c; assignments = a;}

    public int number_of_dates(){
        return calender.size();
    }

    public int assignmentsLength() {return assignments.size();}

    public boolean containsDate(Date d) {
        for (Date element : calender) {
            if (d.equals(element)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Date> getCalendar(){
        return calender;
    }

    public ArrayList<String> getAssignments(){
        return assignments;
    }

    public void addAssignment(String s){assignments.add(0, s);}

    public void printAssignment(){System.out.println(assignments);}



}
