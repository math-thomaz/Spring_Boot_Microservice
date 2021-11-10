Ol�, este � uma demonstra��o de microservi�o  utilizando Java. Separamos o projeto entre dois microservi�os, que se comunicar�o atrav�s de um Servi�o de Registro, utilizando Eureka. Atrav�s do Eureka, podemos analisar se tais aplica��es est�o conectadas corretamente. Para a implementa��o de m�todos de seguran�a, filtros, chamadas via requisi��es HTTP, � necess�rio uma API Gateway. Al�m disso, � ele quem busca todos os microservi�os registrados no Eureka e libera um ponto de entrada/sa�da para os mesmos.

Modo de Uso
Para que todo o projeto opere normalmente, � preciso executar os microservi�os nesta ordem:

1�: Service-Registry
2�: Cloud-Config-Service
3�: Cloud-Gateway
4�: Hystrix-Dashboard

Feito isso, voc� pode rodar os dois microservi�os que adicionamos no projeto: user-service e department-service.

Para acessar:
Foi adicionado uma requisi��o de cria��o e busca para os servi�os de usu�rio e departamento. Ambos s�o acessados atrav�s dos linnks:

localhost:9191/api/v1/users
localhost:9191/api/v1/departments

Para verificar o estado de cada servi�o, utilize o Eureka atrav�s deste link:

localhost:8761

Para verificar a performance de cada servi�o, utilize a Dashboard do Hystrix atrav�s deste link:

localhost:9295/hystrix

Aqui, basta inserir o link do gateway registrado na aplica��o, seguido de /actuator/hystrix.stream:

localhost:9191/actuator/hystrix.stream

Esta aplica��o tamb�m est� habilitada para operar em conjunto com Zipkin. Acesse zipkin.io e clique em Quickstart. Baixe o arquivo .jar e abra atrav�s do terminal com o comando:

java -jar nome_do_arquivo_baixado.jar

Ao carregar, copie o link e abra no servidor, adicionando /zipkin/ no final. Ex:

000.0.0.0:0000/zipkin/



Depend�ncias (por servi�o)

User-Service:
- Eureka Discovery Client
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

Department-Service:
- Eureka Discovery Client
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

Service-Registry:
- Eureka Server

Cloud-Gateway:
- Eureka Discovery Client
- Gateway
- Spring Boot Actuator

Hystrix-Dashboard:
- Eureka Discovery Client
- Hystrix Dashboard

Cloud-Config-Service:
- Eureka Discovery Client
- Config Server



Refer�ncia:
https://javatechonline.com/microservices-in-java/#What_is_Service_Registration_Discovery