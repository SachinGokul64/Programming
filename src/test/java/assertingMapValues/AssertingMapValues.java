package assertingMapValues;

import java.util.*;

public class AssertingMapValues {

    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Raj");
        map.put(2, "Gopal");
        map.put(3, "Appu");
        map.put(4, "Bharat");
        map.put(5, "Sachin");

        List<Map.Entry<Integer,String>> entryList = new ArrayList<>(map.entrySet());


        Collections.sort(entryList,new Comparator<Map.Entry<Integer,String>>(){

            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
               int value = o1.getValue().compareTo(o2.getValue());

               return value;
            }
        });

        System.out.println(entryList);
    }
}
