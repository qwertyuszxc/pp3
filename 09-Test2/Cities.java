import java.util.ArrayList;

public class Cities {
    String[] cts;

    public String[] filter(char StartChar){
        ArrayList<String> filtered = new ArrayList<>();
        for (String i : cts){
            if (i.startsWith(String.valueOf(StartChar))){
                filtered.add(i);
            }
        }
    String[] filt = null;
    filt = filtered.toArray(new String[filtered.size()]);
    return filt;
    }
    public static void main(String[] args) {
        System.out.println(filter('S'));
    }
}
