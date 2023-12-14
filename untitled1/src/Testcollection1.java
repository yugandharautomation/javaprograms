
     import java.util.*;
 public class Testcollection1{
 public static void main(String args[]){
            Vector<String> v=new Vector<String>();
             v.add("NAME1");
             v.add("NAME2");
             v.add("NAME3");
             v.add("NAME4");
             Iterator<String> itr = v.iterator();
             while(itr.hasNext()){
                 System.out.println(itr.next());
                 }
            }
 }

