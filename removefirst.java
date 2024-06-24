import java.util.LinkedList;
public class removefirst {
    public static void main(String args[])
    {
        LinkedList<String>name=new LinkedList<>();
        name.add("abi");
        name.add("astu");
        name.add("viki");
        name.add("arun");
        name.removeFirst();
        System.out.println(name);
    }
    
}
/*
output:
[astu,viki,arun]
