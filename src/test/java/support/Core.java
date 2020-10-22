package support;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class Core {


     protected org.openqa.selenium.WebDriver webDriver = null;



    protected void createChrome() {
        if (webDriver == null) {
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--allow-insecure-localhost");
            options.addArguments("--ignore-certificate-errors");
            options.setExperimentalOption("prefs", prefs);

            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            webDriver.manage().window().maximize();
        }
    }
    protected void killChrome() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
    protected void navigate(String url) {
        webDriver.navigate().to(url);
    }

    protected void click(String elemento) {
        webDriver.findElement(By.xpath(elemento)).click();
    }

    protected void send(String elemento, String text) {
        webDriver.findElement(By.xpath(elemento)).sendKeys(text);
    }

    public boolean exists(String elemento) {
        boolean exist = false;
       if (webDriver.findElements(By.xpath(elemento)).size() > 0){
           exist = true;
       }
        return exist;
    }



    public void print() {

        File screenshot = null;
        String screenshotPath = "src/test/resources/evidences/";
        int filesCount = 1;
        File pathEvidenciasReport = new File(screenshotPath);
        pathEvidenciasReport.mkdirs();
        while (true) {
            File f = new File(screenshotPath  +"evidencia_" + filesCount + ".png");
            if (!f.exists()) {
                break;
            }
            filesCount++;
        }
        screenshot = new File(screenshotPath  + "evidencia_" + filesCount + ".png");
        try {
            FileUtils.moveFile(((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE), screenshot);
                }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
