package com.lexisnexis.pages;

import com.lexisnexis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[1]/a/div[1]")
    public WebElement financialServices;

    @FindBy(xpath = "//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[2]/a/div[1]")
    public WebElement insurance;

    @FindBy(xpath = "//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[3]/a/div[1]")
    public WebElement lifeAndPension;

    @FindBy(xpath = "//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[4]/a/div[1]")
    public WebElement corporationsAndNonProfits;

    @FindBy(xpath = "//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/a[1]")
    public WebElement chooseYourIndustry;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[1]/a/div")
    public WebElement financialCrimeCompliance;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[3]/a/div")
    public WebElement customerDataManagement;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[5]/a/div")
    public WebElement collectionsAndRecovery;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[7]/a/div")
    public WebElement riskOrchestration;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[2]/a/div")
    public WebElement fraudAndIdentityManagement;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[4]/a/div")
    public WebElement creditRiskAssessment;

    @FindBy(xpath = "//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[6]/a/div")
    public WebElement investigationsAndDueDiligence;

    public WebElement getElementByName(String elementName) {
        // Convert the elementName to lowercase and remove spaces
        String normalizedElementName = elementName.toLowerCase().replace(" ", "");

        switch (normalizedElementName) {
            case "financialservices":
                return financialServices;
            case "insurance":
                return insurance;
            case "lifeandpensions":
                return lifeAndPension;
            case "corporationsandnon-profits":
                return corporationsAndNonProfits;
            case "chooseyourindustry":
                return chooseYourIndustry;
            case "financialcrimecompliance":
                return financialCrimeCompliance;
            case "customerdatamanagement":
                return customerDataManagement;
            case "collectionsandrecovery":
                return collectionsAndRecovery;
            case "riskorchestration":
                return riskOrchestration;
            case "fraudandidentitymanagement":
                return fraudAndIdentityManagement;
            case "creditriskassessment":
                return creditRiskAssessment;
            case "investigationsandduediligence":
                return investigationsAndDueDiligence;
            default:
                throw new IllegalArgumentException("Invalid element name: " + elementName);
        }
    }
}