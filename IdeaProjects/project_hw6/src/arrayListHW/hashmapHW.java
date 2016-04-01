package arrayListHW;



import java.util.*;

/**
 * Created by farhana rashid on 3/30/2016.
 */
public class hashmapHW {
    public static void main(String[] args) {


        List<String> lastsix   = new ArrayList();
        lastsix.add("123456");
        lastsix.add("362579");
        lastsix.add("362589");
        lastsix.add("362584");
        lastsix.add("856956");

        List<String> lastsix1 = new ArrayList<>();
        lastsix1.add("475862");
        lastsix1.add("458698");
        lastsix1.add("458694");
        lastsix1.add("458788");
        lastsix1.add("458555");

        List<String> lastsix2 = new ArrayList<>();
        lastsix2.add("526442");
        lastsix2.add("526662");
        lastsix2.add("526772");
        lastsix2.add("526742");
        lastsix2.add("526752");

        Map<String,List<String>> number = new LinkedHashMap<>();
        number.put("347",lastsix);
        number.put("718",lastsix1);
        number.put("646",lastsix2);

        //for(Map.Entry<String,List<String>> mapped :number.entrySet())
          //  System.out.println("Key: " + mapped.getKey() + " value : " + mapped.getValue());

        Iterator it = (number.entrySet().iterator());
        while(it.hasNext())
            System.out.println(it.next());











    }
    }

