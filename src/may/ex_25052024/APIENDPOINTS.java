package may.ex_25052024;

public enum APIENDPOINTS {
    HOME("https://app.vwo.com/", "Homepage"),
    LOGIN("https://app.vwo.com/login", "Login"),
    DASHBOARD("https://app.vwo.com/dashboard","Dashboard");


    String url;
    String page;
    //Home->https://app.vwo.com/
    //Login->https://app.vwo.com/login
    //Dashboard->https://app.vwo.com/dashboard
    APIENDPOINTS(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
