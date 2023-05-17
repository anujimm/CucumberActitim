package com.envision.actitime.pageobjects;

import com.envision.actitime.utility.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage extends BasePage {
    private WebDriver driver;

    public TimeTrackPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "container_tasks")
    private WebElement tasksLink;

    public String getPageTitle() {
        CommonUtil.waitDefinite(3);
        return this.driver.getTitle();
    }
    public void clickTasksPage() {
        tasksLink.click();
    }
}
