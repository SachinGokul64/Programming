package staticConcepts;


/*
    Static - Is a keyword
        Variable - When assigned with variable the variable is considered as constant and can be accessed with the class name.
        * This variable is class level and shared among all the instances
 */
public class StaticConceptsE2E {
    static int number = 10;

    static{
        System.out.println("Static block");
    }

    static {
        System.out.println("static 2nd block");

    }

    StaticConceptsE2E(){
        System.out.println("Constructor");
    }

    public static void create()
    {
        System.out.println("Static method");

    }

    public static void main(String[] args)
    {
       StaticConceptsE2E sta = new StaticConceptsE2E();
       sta.create();
       StaticConceptsE2E.create();

    }
}
