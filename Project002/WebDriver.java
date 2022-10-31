package Project002;

public interface WebDriver {
    void open();
    void closed();
    String getTittle();
}
interface TakeScreenShot{
    void getscreenShot();
}

interface RemoteWebDriver extends WebDriver,TakeScreenShot {
    void naviget();
}

class ChromeDriver implements RemoteWebDriver {


    @Override
    public void open() {
        System.out.println("Open the Chrome Browser");
    }


    @Override
    public void closed() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTittle() {
        return "Tittle of Chrome Browser";
    }

    @Override
    public void getscreenShot() {
        System.out.println("Take screenshot of Chrome Browser");
    }

    @Override
    public void naviget() {
        System.out.println("Navigate in Chrome Browser");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open the Firefox Browser");

    }

    @Override
    public void closed() {
        System.out.println("Close the Firefox Browser");

    }

    @Override
    public String getTittle() {
        return "Tittle of Firefox";
    }

    @Override
    public void getscreenShot() {
        System.out.println("Take screenshot of Firefox Browser");
    }

    @Override
    public void naviget() {
        System.out.println("Navigate in firefox Browser");
    }
}
class Safari implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open the Safari Browser");
    }

    @Override
    public void closed() {
        System.out.println("Close the Safari Browser");

    }

    @Override
    public String getTittle() {
        return "Tittle of Safari";
    }

    @Override
    public void getscreenShot() {
        System.out.println("Take screenshot of Safari Browser");
    }

    @Override
    public void naviget() {
        System.out.println("Navigate in Safari Browser");
    }

    public static void main(String[] args) {
        RemoteWebDriver[]web={new ChromeDriver(),new FirefoxDriver(),new Safari()};
        for(RemoteWebDriver drive:web){
            drive.open();
            drive.closed();
            drive.getTittle();
            drive.naviget();
            drive.getscreenShot();

        }
    }
}

