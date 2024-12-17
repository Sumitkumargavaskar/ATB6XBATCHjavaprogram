package may.ex_18052024;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new Test1(); //dynamic dispatch
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}
//oops concept singleinheritance
class Test1 extends BaseClass{
    //method overriding
    @Override
    public void setBrowser(String browser, boolean isAuth) {
//        super.setBrowser(browser, isAuth);
        System.out.println("I am done");
    }
}

//single inherttance
class BaseClass {
    private String browser;

    public String getBrowser() {
        return browser;
    }
//encapsulation
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    //Method overloading concept
    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Open Browser!!");
    }
}

