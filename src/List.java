
import java.util.*;
public class List {
    public static void main(String[] args) {


             ArrayList<String> l1 = new ArrayList<String>();   //Creating arraylist
             l1.add("yashu");          //Adding object in arraylist
             l1.add("i");
             l1.add("am");
             l1.add("here");
             //Traversing list through Iterator
             Iterator<String> itr=l1.Iterator();
             while(itr.hasNext()){
                 System.out.println(itr.hasNext());
                 }
             }

