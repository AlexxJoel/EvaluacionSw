package blazeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemo {

    public BlazeDemo(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[3]/form/select[1]")
    private WebElement select1;
    @FindBy(xpath = "/html/body/div[3]/form/select[1]/option[3]")
    private WebElement opBoston;
    @FindBy(xpath = "/html/body/div[3]/form/select[2]")
    private WebElement select2;
    @FindBy(xpath = "/html/body/div[3]/form/select[2]/option[4]")
    private WebElement opBerlin;
    @FindBy(xpath = "/html/body/div[3]/form/div/input")
    private WebElement btnfind;
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]/input")
    private WebElement btnAerolinea;
    @FindBy(xpath = "//*[@id=\"inputName\"]")
    private WebElement txtName;
    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement txtAddress;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement txtCity;
    @FindBy(xpath = "//*[@id=\"state\"]")
    private WebElement txtState;
    @FindBy(xpath = "//*[@id=\"zipCode\"]")
    private WebElement txtSip;
    @FindBy(xpath = "//*[@id=\"cardType\"]")
    private WebElement select3;
    @FindBy(xpath = "//*[@id=\"cardType\"]/option[3]")
    private WebElement optCard;
    @FindBy(xpath = "//*[@id=\"creditCardNumber\"]")
    private WebElement txtCardNumber;
    @FindBy(xpath = "//*[@id=\"nameOnCard\"]")
    private WebElement txtCardName;
    @FindBy(xpath = "/html/body/div[2]/form/div[11]/div/input")
    private WebElement btnPurchase;

    public void selection(){
        select1.click();
        opBoston.click();
        select2.click();
        opBerlin.click();
        btnfind.click();
        btnAerolinea.click();
        txtName.sendKeys("Cristian");
        txtAddress.sendKeys("Bugambilias");
        txtCity.sendKeys("Jiutepec");
        txtState.sendKeys("Morelos");
        txtSip.sendKeys("62577");
        select3.click();
        optCard.click();
        txtCardNumber.sendKeys("987654321");
        txtCardName.sendKeys("Campos Roman Cristian");
        btnPurchase.click();
    }
}
