import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeTest
    public void beforeTestMethod(){
        System.out.print("Before test method");
    }
    @BeforeMethod
    @Parameters("browser")
    public void beforeMethodMethod(String browser){
       setupbrowser("edge");



    }
    @AfterMethod
    public void afterMethodMethod(){

    }
    @AfterTest
    public void afterTestMethod(){}


}

public void setupbrowser(String browser){
    if(browser.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
    }
    else if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
    }
    else if(browser.equalsIgnoreCase("edge")){
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
    }
}

public void main() {
}
