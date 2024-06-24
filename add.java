import java.util.LinkedList;
public class add {
    public static void main(String args[])
    {
        LinkedList<String>numbers=new LinkedList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        System.out.println(numbers);
        numbers.clear();
        System.out.println("After clearing the elements:");
        numbers.add("six");
        numbers.add("seven");
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
*/
output:
[one,two,three,four,five]
[]
[six,seven]
 2   
