package userinterface;

public enum EnviarUrl {
    URL_SAWGSLABS("https://www.saucedemo.com/index.html");

    private final String url;

    EnviarUrl(String url) {
        this.url = url;
    }

    public String getUrl(){
        return  this.url;
    }
}
