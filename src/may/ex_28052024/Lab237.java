package may.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237 {
    public static void main(String[] args) {
        //API Endpoints
        //pages - Loginpage, Dashboard, Homepage
        List url_pages = new ArrayList();
        url_pages.add("Login page");
        url_pages.add("Dashboard");
        url_pages.add("Hpomepage");
        System.out.println(url_pages);

        for (int i =0; i < url_pages.size(); i ++ ) {
            System.out.println(url_pages.get(i));
        }

        for (Object page : url_pages) {
            System.out.println(page);
        }

        Iterator itr = url_pages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
