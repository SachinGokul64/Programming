import java.util.HashMap;
import java.util.Map;

public class CountTheRepeatingCharacters {

    public static void main(String[] args)
    {
        String str = "sachinsaksakak,slamlkxn03932";

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<= str.length()-1; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1   );
            }else{
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);
    }
}
