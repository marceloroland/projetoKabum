Feature: Projeto da kabum
Scenario: Acessar a kabum e validar o login
Given O usuario acessa a pagina da kabum "http://www.kabum.com.br"
When O usuario realiza o login utilizando o usuario "meiquer1@outlook.com" e a senha "602030"
Then O usuario valida que o login foi realizado com sucesso

