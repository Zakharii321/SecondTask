import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class UISecond {

    private WebDriver driver;


    @Before
    public void setUp() {
        System.out.println("Start Browser");

            System.setProperty("webdriver.gecko.driver" , "/home/zakharii/testproject/geckodriver");

         driver= new FirefoxDriver();// open browser
        driver.manage().window().maximize();// maximize for browser window
        System.out.println("Open website");
        driver.get("http://www.uitestingplayground.com/home");//open url

    }

    @After
    public void cleanUp(){
        System.out.println("Close browser");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //to do auto-generated catch block
           e.printStackTrace();
        }
        if (driver != null)
            driver.quit(); // close browser;
    }

    @Test
    public void inputbutton(){
        System.out.println("Click on text input button");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[4]/h3/a")).click();
        System.out.println("Enter great job");
        driver.findElement(By.id("newButtonName")).sendKeys("Great Job Zakharii");
        System.out.println("Click button");
        driver.findElement(By.id("updatingButton")).click();
    }

    @Test
    public void click() {

        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/h3/a")).click();
        System.out.println("We opened click button");
        driver.findElement(By.xpath("//*[@id=\"badButton\"]")).click();
        System.out.println("We finished this task");
    }

    @Test
    public void loadDelay() {
        driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[4]/h3/a")).click();
        System.out.println("Now we should wait");
    }

    @Test
    public void HiddenLayers() {
        driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[3]/h3/a")).click();
        driver.findElement(By.id("greenButton")).click();
        //assert.assertEquals("")
       // assertEquals("greenButton", blueButton());
    }

 //   @Test
  //  public void DynamicId(){
 //       driver.findElement(By.cssSelector("#overview > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")).click();
 //       driver.findElement(By.className("btn btn-primary")).click();
 //   }

    @Test
    public void AJAXdata(){
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ajaxButton\"]")).click();
        try {
            Thread.sleep(16000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/section/div/div/p"));
    }

 //   @Test
  //  public void ClassAttribute(){
 //       driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
  //      driver.findElement(By.className("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
  //  }

 //   @Test
  //  public void ScrollBars(){

   // }

 //   @Test
  //  public void Visability(){

  //  }

  //  @Test
  //  public void ClientSideDelay(){

 //   }

 //   @Test
 //   public void DynamicTable(){

 //   }

    @Test
    public void SampleApp(){
driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div[2]/h3/a")).click();
driver.findElement(By.name("UserName")).sendKeys("Zakharii");
driver.findElement(By.name("Password")).sendKeys("pwd");
driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    }

//    @Test
//    public void VerifyText(){

//    }

    @Test
    public void MouseOver(){
driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div[3]/h3/a")).click();
driver.findElement(By.xpath("/html/body/section/div/div[1]/a")).click();
driver.findElement(By.xpath("/html/body/section/div/div[1]/a")).click();
    }

 //   @Test
  //  public void ProgressBar(){

//    @Test
//    public void NonBreakingSpace(){

 //   }


    }


















    }
