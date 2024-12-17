package may.ex_14052024;

public class AutomationClass {
String name;
    AutomationClass() {
        dataBaseConnection();
        excelopen();
    }

    public AutomationClass(String name) {
        this.name = name;
    }

    void dataBaseConnection() {
        System.out.println("Mysql connection is created");
    }

    void excelopen() {
        System.out.println("excel open");

    }
    void testCase1() {
        System.out.println("testcase1"+this.name);

    }
    void testCase2() {
        System.out.println("testcase2"+this.name);

    }


    public static void main(String[] args) {
        AutomationClass tc1 = new AutomationClass("TC1");
        AutomationClass tc2= new AutomationClass("TC2");
        System.out.println(tc1.name);
        tc1.testCase1();
        tc1.testCase2();


        System.out.println(tc2.name);

        tc2.testCase1();
        tc2.testCase2();

    }
}



