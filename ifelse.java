import java.util.LinkedList;
public class ifelse {
    public static void main(String args[])
    {
        LinkedList<String>name=new LinkedList<>();
        name.add("mars");
        name.add("uranus");
        name.add("jupiter");
        name.add("neptune");
        System.out.println(name);
        if(name.contains("mars"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
