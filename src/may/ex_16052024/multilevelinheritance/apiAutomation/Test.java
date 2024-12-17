package may.ex_16052024.multilevelinheritance.apiAutomation;

import java.lang.module.ModuleDescriptor;

import static javax.xml.transform.OutputKeys.VERSION;

public class Test extends BaseTest {
    void accessExcelAndSQUL() {
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println(VERSION);
    }

   void openJSON() {
       System.out.println("Test");

    }
}
