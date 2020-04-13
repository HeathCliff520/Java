package ExerciseP2.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountAmoutofChar {
    public static void main(String[] args) {
        String text="gsgsgvvshl";
        countAstring(text);
    }

    private static void countAstring(String str) {
        char getChar[]=str.toCharArray();
                        int waitfor=1;
        Map<Character,Integer> mapOfchar=new HashMap<>();
        for (char cig:getChar) {
            if (!mapOfchar.containsKey(cig)){
                mapOfchar.put(cig,waitfor);
            }else {
                mapOfchar.put(cig,mapOfchar.get(cig)+1);
            }
        }
        Set<Character> characterSet = mapOfchar.keySet();
        for (Character x:characterSet) {
            Integer Value=mapOfchar.get(x);
            System.out.println(x+":"+Value);
        }


    }
}
