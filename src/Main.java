import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> sSet = new HashSet<>();
        sSet.add("Nugga");
        sSet.add("Freja");
        sSet.add("Casper");
        sSet.add("Bo");
        minLength(sSet);

    }
    public static int minLength(Set<String> stringSet){

        //This values insures that the if statement works (somehow)
        int minLength = 999;

        for (String str : stringSet){
            if (minLength > str.length()){
                minLength = str.length();
            }
        }
        if (stringSet.isEmpty()){
            minLength = 0;
        }
        System.out.println( minLength);
        return minLength;
    }
}
