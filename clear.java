import java.util.LinkedList;
public class clear {
    public static void main(String args[])
    {
        LinkedList<String>numbers=new LinkedList<>();
        numbers.add("one");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.clear();
        System.out.println(numbers);
        numbers.add("Five");
        numbers.add("Six");
        System.out.println(numbers);



    }
    
}
*/
output:
[]
[Five,Six]
