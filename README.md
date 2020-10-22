# projetoKabum



Para executar o projeto de automação é possivel 2 caminhos


1° Caminho

Pré-requisitos:
Ter java instalado no ambiente

Passo-a-passo:
Realizar download da IDE IntelliJ (Ou outra IDE de preferencia, como Eclipse etc..)
Realizar download do projeto de automação
Importar o projeto
Caso as dependencias não importem automaticamente ->Dentro da IDE com o projeto já importado, clicar com o botão direito no arquivo pom.xml -> maven -> Reload project
Executar a classe Runner


2° Caminho
Pré-requisitos:
Ter java instalado no ambiente
Ter a variavel de ambiente JAVA_HOME definida

Passo-a-passo:
Realizar download do projeto de automação
Realizar download dos arquivos binarios do MAVEN no seguinte link -> https://maven.apache.org/download.cgi
  -Binary zip archive	-> apache-maven-3.6.3-bin.zip

Na variavel PATH adicionar o caminho:
C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin <- Caminho de exemplo

Abrir o CMD e navegar para a pasta do projeto
"cd C:\CAMINHO ATÉ A PASTA DO PROJETO"

Executar o comando abaixo:
mvn clean test -DfailIfNoTests=false -Dtest=runner.Runner
