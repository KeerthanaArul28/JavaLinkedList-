import java.util.LinkedList;
public class removeparticularobject {
    public static void main(String args[])
    {
        LinkedList<String>technology=new LinkedList<>();
        technology.add("c,C++");
        technology.add("Java");
        technology.add("React");
        technology.add("Angular");
        technology.remove("React");
        System.out.println(technology);
        technology.remove(1);
        System.out.println(technology);
    }
    
}
