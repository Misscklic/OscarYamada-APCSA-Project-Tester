import java.util.ArrayList;

public class StringList
{
    public static int length(ArrayList<String> words)
    {
        return words.size();
    }

    public static int totalLength(ArrayList<String> words) {
        int stringsize = 0;
        for (String element : words) {
            stringsize = +element.length();
        }
        return stringsize;
    }

    public static void add(ArrayList<String> words, String newWord){
        words.add(newWord);
    }

    public static int indexOf(ArrayList<String> words, String newWord){
        int i = 0;
        for (String element : words){
            if(element.equals(newWord)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int count(ArrayList<String> words, String newWord){
        int i = 0;
        for (String element : words){
            if (element.equals(newWord)){
                i++;
            }
        }
        return i;
    }

    public static void addOrder(ArrayList<String> words, String newWord){
        int i = 0;
        for (String element : words){
            if (i-1 == words.size()){
                words.add(newWord);
            }
            if (newWord.compareTo(element) < 0){
                words.add(i, newWord);
            }
            i++;
        }
    }

}
