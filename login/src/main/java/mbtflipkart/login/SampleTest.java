package mbtflipkart.login;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Handler;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@GraphWalker(value = "random(edge_coverage(80))", start = "e_start_Browser")
public class SampleTest extends ExecutionContext implements sampledirectedgraph
{
	private static final Logger logger = LoggerFactory.getLogger(SampleTest.class.getName());
	 public final static Path MODEL_PATH = Paths.get("mbtflipkart/login/sampledirectedgraph.graphml");
    WebDriver driver = null;
    WebDriverWait waiter = null;
    Integer numberOfAddedBooksByProgam = 0;
    
    @BeforeExecution
    public void setup() throws IOException {
    	WebDriverManager.firefoxdriver().setup();
    	Handler fileHandler = new FileHandler("org/graphwalker/flipkart.log",2000,5);
    	//logger.a
    	logger.info("inside before Execution method");
    }
    
    @AfterExecution
    public void cleanup() {
        if (driver != null) {
            driver.quit();
        }
        logger.info("inside AfterExecution");
    }
    
    public void e_start_Browser() {
    	
        driver = new FirefoxDriver();
        Assert.assertNotNull(driver);
        waiter = new WebDriverWait(driver, 10);
        logger.info("Inside Edge startBrowser");
        driver.get("https://www.google.co.in");
    }
    public void e_women_page_load() {
    	logger.info("Inside Edge WomeSareeSection");
    }
    public void e_mi_page_load()
    {
    	logger.info("Inside Edge mi page load");
    }
    public void e_samsung_page_load()
    {
    	logger.info("Inside Edge samsung page load");
    }
    public void e_mens_page_load()
    {
    	logger.info("Inside Edge mens page load");
    }
       
    public void v_BrowserStarted() {
        //Assert.assertNotNull(driver);
    	logger.info("Inside vertex browser started");
    }
    public void v_womenSareePage()
    {
    	logger.info("Inside vertex WomeSareeSection");
    }
    
    public void v_mensPage()
    {
    	logger.info("Inside vertex MensSection");
    }
    
    public void v_samsung_page()
    {
    	logger.info("Inside vertex SamsungSection");
    }
    
    public void v_mi_page_Electronic()
    {
    	logger.info("Inside vertex Mi Section");
    }
    
   /* 
    public void runSmokeTest() {
        new TestBuilder()        
            .addModel(MODEL_PATH, new RandomPath(new EdgeCoverage(80)),"e_start_Browser")            
            .execute();
    }*/

	public void v_mi_pageElectronic() {
		// TODO Auto-generated method stub
		
	}

}
