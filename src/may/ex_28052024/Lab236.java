package may.ex_28052024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab236 {
    public static void main(String[] args) {
        //Legacy class
        List mylist1 = new ArrayList();
        mylist1.add("Kumar");
        mylist1.add("Gavaskar");
        mylist1.add("Golu");
        mylist1.add("Ayush");
        System.out.println(mylist1);

        Vector v =  new Vector();
        v.add("Kumar");//t1
        v.add("Gavaskar");//t2
        v.add("Golu");//t3
        v.add("Ayush");//t4
        v.remove("Golu");
        System.out.println(v);


    }
}
