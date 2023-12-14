import java.util.ArrayList;
import java.util.List;

public class Testcollection3 {
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<>();
        l1.add(3);
        l1.add(5);
        l1.add(0,10);
        List<Integer> l2=new ArrayList<>();
        l2.add(30);
        l2.add(40);
        System.out.println(l1);
        l1.addAll(1,l2);
        System.out.println(l1);
        System.out.println(l2);
        l2.remove(1);
        System.out.println(l2);
        System.out.println(l1.get(2));
    }
}
