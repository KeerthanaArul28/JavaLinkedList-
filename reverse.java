import java.util.LinkedList;
public class reverse {
    public static void main(String args[])
    {
        LinkedList<String>reverse=new LinkedList<>();
        reverse.add("Banana");
        reverse.add("Apple");
        reverse.add("Mango");
        reverse.add("Pineapple");
        System.out.println(reverse);
        System.out.println(reverse.reversed());


}
    }
//output:
/*
[Banana, Apple, Mango, Pineapple]
[Pineapple, Mango, Apple, Banana]
    */
    

