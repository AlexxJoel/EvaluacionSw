package examn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Excersice1 {

    public Excersice1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

     @FindBy(xpath= "//*[@id='usuario']")
     private WebElement userName;
    
     @FindBy(xpath="//*[@id='password']")
     private WebElement userPassword;
     
     @FindBy(xpath = "//*[@id=\"entrarSistema\"]")
     private WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"productoVenta\"]/option[7]")
    private WebElement op2;

    @FindBy(xpath = "//*[@id=\"clienteVenta\"]/option[87]")
    private WebElement op1;

    @FindBy(xpath = "//*[@id=\"btnAgregaVenta\"]")
    private WebElement btnAgregarVenta;
    @FindBy(xpath = "//*[@id=\"tablaVentasTempLoad\"]/table/caption/span")
    private WebElement btnGenerar;
    @FindBy(xpath = "//*[@id=\"ventasHechasBtn\"]")
    private WebElement btnHechas;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[4]/div[2]/button")
    private WebElement modal;

     //

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[3]/a")
    private WebElement administrarUsuarios;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[3]/a")
    private WebElement clientes;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[2]/a")
    private WebElement adminstrarArticulo;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a")
    private WebElement categoria;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[2]/ul/li[2]/a")
    private WebElement articulo;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[4]/a")
    private WebElement solodArticulo;




    //--------------------------------------------------------------


    @FindBy(xpath = "//*[@id=\"nombre\"]")
    private WebElement nombre;

    @FindBy(xpath = "//*[@id=\"apellido\"]")
    private WebElement apellido;

    @FindBy(xpath = "//*[@id=\"usuario\"]")
    private WebElement user;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;


    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[6]/a")
    private WebElement cerrar;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[6]/ul")
    private WebElement cerrar2;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[5]/a")
    private WebElement cerrar3;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[5]/ul")
    private WebElement cerrar4;

    @FindBy(xpath = "//*[@id=\"tablaUsuariosLoad\"]/table/tbody/tr[21]/td[1]")
    private WebElement xd;


    //-----------------------------------------------
    @FindBy(xpath = "//*[@id=\"nombre\"]")
    private WebElement nombreCliente;

    @FindBy(xpath = "//*[@id=\"apellidos\"]")
    private WebElement apellidoCliente;

    @FindBy(xpath = "//*[@id=\"direccion\"]")
    private WebElement direccionCliente;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailCLiente;


    @FindBy(xpath = "//*[@id=\"telefono\"]")
    private WebElement telefonoCLiente;

    @FindBy(xpath = "//*[@id=\"rfc\"]")
    private WebElement rfcCliente;


    @FindBy(xpath = "//*[@id=\"btnAgregarCliente\"]")
    private WebElement registrarCliente;
    //---------------------------

    @FindBy(xpath = "//*[@id=\"categoria\"]")
    private WebElement nameCategory;

    @FindBy(xpath = "//*[@id=\"btnAgregaCategoria\"]")
    private WebElement registerCategory;


    //--------------------------------------------------------


    @FindBy(xpath = "//*[@id=\"categoriaSelect\"]")
    private WebElement registerArticuloCategory;
    @FindBy(xpath = "//*[@id=\"nombre\"]")
    private WebElement registerArticuloName;
    @FindBy(xpath = "//*[@id=\"descripcion\"]")
    private WebElement registerArticuloDescription  ;
    @FindBy(xpath = "//*[@id=\"cantidad\"]")
    private WebElement registerArticuloCantidad ;
    @FindBy(xpath = "//*[@id=\"precio\"]")
    private WebElement registerArticuloPrice;
    @FindBy(xpath = "//*[@id=\"imagen\"]")
    private WebElement registerArticuloIMG;
    @FindBy(xpath = "//*[@id=\"btnAgregaArticulo\"]")
    private WebElement btnArticle;

    //--------------------------------------------

    @FindBy(xpath = "//*[@id=\"ventaProductosBtn\"]")
    private WebElement sendArticle;


    @FindBy(xpath = "//*[@id=\"ventaProductosBtn\"]")
    private WebElement sCLient;
    @FindBy(xpath = "//*[@id=\"ventaProductosBtn\"]")
    private WebElement sProduct;
    @FindBy(xpath = "//*[@id=\"tablaVentasTempLoad\"]/table/caption/span")
    private WebElement sgnrvema;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[4]/div[2]/button")
    private WebElement alert;
    @FindBy(xpath = "//*[@id=\"ventasHechasBtn\"]")
    private WebElement ventaHecha;




























    @FindBy(xpath = "//*[@id=\"registro\"]")
    private WebElement crearUser;


    public void selection() throws InterruptedException {
        System.out.println("Entro");
        administrarUsuarios.click();
        nombre.sendKeys("Alejandro Joel");
        apellido.sendKeys("Herrera Hernandez");
        user.sendKeys("Alexx");
        password.sendKeys("1234");
        Thread.sleep(1000);
        crearUser.click();
        xd.click();

        Thread.sleep(2000);
    }


     public void login(String user, String password){
            userName.sendKeys(user);
            userPassword.sendKeys(password);
            btnLogin.click();
     }

     public void cerrarsesion(){
         cerrar.click();
         cerrar2.click();
     }

    public void cerrarsesionAlexx(){
        cerrar3.click();
        cerrar4.click();
    }



    public void selection2() throws InterruptedException {
        clientes.click();
        nombreCliente.sendKeys("Joel_Alejandro" + "_4A-DSM");
        apellidoCliente.sendKeys("Herrera_Herandez");
        direccionCliente.sendKeys("Cuernabaches");
        emailCLiente.sendKeys("20213tn019@utez.edu.mx");
        telefonoCLiente.sendKeys("7774138126");
        rfcCliente.sendKeys("AGDH848");
        Thread.sleep(1000);
        registrarCliente.click();


     }



     public void articuloadminCategory() throws InterruptedException {
        adminstrarArticulo.click();
        categoria.click();
        nameCategory.sendKeys("Joel_Herrera_4ADSM");
        Thread.sleep(1000);
        registerCategory.click();
     }


    public void articulo() throws InterruptedException {
        adminstrarArticulo.click();
        articulo.click();
        registerArticuloCategory.sendKeys("Joel_Herrera_4ADSM");
        registerArticuloName.sendKeys("JoelHerrera_Mexico");
        registerArticuloDescription.sendKeys("Bontio");
        registerArticuloCantidad.sendKeys("1");
        registerArticuloPrice.sendKeys("200");
        registerArticuloIMG.sendKeys("C:\\Users\\joelh\\Downloads\\JoelDeveloper.png");
        btnArticle.click();
        btnArticle.click();

    }


    public void ventamade() throws InterruptedException {
        adminstrarArticulo.click();
        articulo.click();
        Thread.sleep(2000);
        op1.click();
        op2.click();
        Thread.sleep(2000);
        btnAgregarVenta.click();
        Thread.sleep(2000);
        btnGenerar.click();
        Thread.sleep(2000);
        modal.click();
        Thread.sleep(2000);
        btnHechas.click();
    }


}
