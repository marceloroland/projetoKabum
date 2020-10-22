package objects;

public class MainPage {

    public static final String BUTTON_LOGIN = "//li[@id=\"li-login-usuario\"]";
    public static final String INPUT_LOGIN_EMAIL_CNPJ_CPF = "//span[contains(text(),\"E-MAIL, CPF ou CNPJ\")]/following-sibling::input[@name=\"login\"]";
    public static final String INPUT_SENHA = "//span[contains(text(),\"SUA SENHA\")]/following-sibling::input[@name=\"senha\"]";
    public static final String BUTTON_ENTRAR = "//input[@name=\"login\"][@type=\"image\"]";
    public static final String TEXT_USUARIO_LOGADO = "//a[@class=\"cliente-logado\"]";
}
