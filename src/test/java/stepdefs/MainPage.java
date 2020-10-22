package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.Core;

import static objects.MainPage.*;
import static objects.MainPage.BUTTON_ENTRAR;


public class MainPage extends Core{


    @Given("O usuario acessa a pagina da kabum {string}")
    public void oUsuarioAcessaAPaginaDaKabum(String arg0) {
        createChrome();
        navigate(arg0);
        print();
    }

    @When("O usuario realiza o login utilizando o usuario {string} e a senha {string}")
    public void oUsuarioRealizaOLoginUtilizandoOUsuarioEASenhaMarcelo(String arg0, String arg1) throws Throwable {
        click(BUTTON_LOGIN);
        send(INPUT_LOGIN_EMAIL_CNPJ_CPF, arg0);
        send(INPUT_SENHA, arg1);
        print();
        click(BUTTON_ENTRAR);
        print();
    }
    @Then("O usuario valida que o login foi realizado com sucesso")
    public void oUsuarioValidaQueOLoginFoiRealizadoComSucesso() {
            if (exists(TEXT_USUARIO_LOGADO)){
                print();
                System.out.println("O usuario logou com sucesso");
                killChrome();
            }else {
                System.out.println("O usuario não efetuou o login.");
                killChrome();
            }
    }
}
