package stringReverse;

public class StringReverse {

    public static void main(String[] args) {

        /*
        String
        1. String is immutable class
        2. String is thread safe and on every modification it creates a new object
        3. Because of immutable character, It requires more memory and time for  manupulation
        4. Used: In thread safe envirnoment
         */

        /*
        StringBuilder
        1. String builder is mutable class
        2. This is not thread safe and most recommened when there is no concern of thread safe
        3. It manupulates the exsiting object on modfication of the object.
        4, StringBuilder is not synchronised
         */

        /*
        StringBuffer
        1. Stringbuffer is mutuable class
        2. This is thread safe.
        3. It takes more time and memory for the manupulation of the object
        4. String buffer is not synchronised.
         */

        String str = "Selenium";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();



        System.out.println(str+"----"+builder);

    }
}
