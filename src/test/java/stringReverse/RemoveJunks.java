package stringReverse;

public class RemoveJunks {
    public static void main(String[] args)
    {
        String str = "**#)#_@ Selenium**## Java(())))";
       str = str.replaceAll("[^a-zA-Z0-9]"," ");
       str = str.trim();
        System.out.println(str);
    }
}
