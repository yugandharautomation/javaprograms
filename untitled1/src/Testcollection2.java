
import java.util.*;
 class TestJavaCollection2 {
     public static void main(String args[]) {
         ArrayList<String> list = new ArrayList<String>();   //Creating arraylist
         list.add("NAME1");          //Adding object in arraylist
         list.add("NAME2");
         list.add("NAME3");
         list.add("NAME4");
         list.add("hlo");
         //Traversing list through Iterator
         Iterator<String> itr = list.iterator();
         while (itr.hasNext()) {
             System.out.println(itr.next());
         }
     }
 }
