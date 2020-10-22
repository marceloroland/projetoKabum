# projetoKabum



Para executar o projeto de automação é possivel 2 caminhos


# 1° Caminho <h1>

Pré-requisitos:
Ter java instalado no ambiente

# Passo-a-passo:
Realizar download da IDE IntelliJ (Ou outra IDE de preferencia, como Eclipse etc..) \
Realizar download do projeto de automação \
Importar o projeto \
Caso as dependencias não importem automaticamente ->Dentro da IDE com o projeto já importado, clicar com o botão direito no arquivo pom.xml -> maven -> Reload project 



![alt text](https://raw.githubusercontent.com/marceloroland/projetoKabum/main/imgs_git/reload_project.png)



Executar a classe Runner



![alt text](https://raw.githubusercontent.com/marceloroland/projetoKabum/main/imgs_git/class_runner.png)



# 2° Caminho <h1>
  
# Pré-requisitos:
Ter java instalado no ambiente \
Ter a variavel de ambiente JAVA_HOME definida \

# Passo-a-passo:
Realizar download do projeto de automação \
Realizar download dos arquivos binarios do MAVEN no seguinte link -> https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip

# Na variavel PATH adicionar o caminho:
C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin <- Caminho de exemplo

# Abrir o CMD e navegar para a pasta do projeto
"cd C:\CAMINHO ATÉ A PASTA DO PROJETO"

Executar o comando abaixo:
mvn clean test -DfailIfNoTests=false -Dtest=runner.Runner
