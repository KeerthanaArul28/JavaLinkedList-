import java.util.LinkedList;
public class ifelseif {
    public static void main(String args[])
    {
        LinkedList<String>colors=new LinkedList<>();
        colors.add("blue");
        colors.add("pink");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);
        if(colors.contains("green"))
        {
            System.out.println("colors is not appear");
        }
        else if(colors.contains("yellow"))
        {
            System.out.println("colors is appear");
        }
        else
        {
            System.out.println("False");
        }
    }
}
//output:
/*
[blue, pink, purple, yellow]
colors is appear
*/
