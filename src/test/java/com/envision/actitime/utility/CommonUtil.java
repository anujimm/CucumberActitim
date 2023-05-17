package com.envision.actitime.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonUtil {
    private static Object Screenshot;

    public static void waittimeInSeconds(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCurrentDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_DD-hh-mm-ss"));
    }

    public static void takePageVisibleScreenshot() {
       // TakesScreenshot tss = (TakesScreenshot) BrowserFactory.getBrowser();
    //    File from = tss.getScreenshotAs(OutputType.FILE);
   //     File to = new File("actitime_screenshots/" + getCurrentDate() + ".png");
   //     try {
   //         FileHandler.copy(from, to);
  //      } catch (IOException e) {
   //         new RuntimeException(e);
        }
  //  }

 public static void takeFullScreenshot() {
      //  Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(BrowserFactory.getBrowser());

     //   try {
     //       ImageIO.write(screenshot.getImage(), "jpg", new File("actitime_screenshots/" + getCurrentDate() + ".png"));
   //     } catch (IOException e) {
   //         throw new RuntimeException(e);
  //      }
    }

    public static void takeElementScreenShots(WebElement element) {
        TakesScreenshot tss = (TakesScreenshot) element;
        File from = tss.getScreenshotAs(OutputType.FILE);
        File to = new File("actitime_screenshots/" + getCurrentDate() + ".png");
        try {
            FileHandler.copy(from, to);
        } catch (IOException e) {
            new RuntimeException(e);
        }
    }

    public static void waitDefinite(int i) {
    }
}
