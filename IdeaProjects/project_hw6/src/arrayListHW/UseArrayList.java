package arrayListHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by farhana rashid on 3/30/2016.
 */
public class UseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("ABONI");
        list.add("ADNAN");
        list.add("FLORA");
        list.add("RAYAN");
        list.add("JISHAN");

       Iterator name =  list.iterator();
            while(name.hasNext())
            System.out.println(name.next());


        //for(String name1: list) {
          //  System.out.println(name1);
        }





    }

