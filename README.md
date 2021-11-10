Olá, este é uma demonstração de microserviço  utilizando Java. Separamos o projeto entre dois microserviços, que se comunicarão através de um Serviço de Registro, utilizando Eureka. Através do Eureka, podemos analisar se tais aplicações estão conectadas corretamente. Para a implementação de métodos de segurança, filtros, chamadas via requisições HTTP, é necessário uma API Gateway. Além disso, é ele quem busca todos os microserviços registrados no Eureka e libera um ponto de entrada/saída para os mesmos.

Modo de Uso
Para que todo o projeto opere normalmente, é preciso executar os microserviços nesta ordem:

1º: Service-Registry
2º: Cloud-Config-Service
3º: Cloud-Gateway
4º: Hystrix-Dashboard

Feito isso, você pode rodar os dois microserviços que adicionamos no projeto: user-service e department-service.

Para acessar:
Foi adicionado uma requisição de criação e busca para os serviços de usuário e departamento. Ambos são acessados através dos linnks:

localhost:9191/api/v1/users
localhost:9191/api/v1/departments

Para verificar o estado de cada serviço, utilize o Eureka através deste link:

localhost:8761

Para verificar a performance de cada serviço, utilize a Dashboard do Hystrix através deste link:

localhost:9295/hystrix

Aqui, basta inserir o link do gateway registrado na aplicação, seguido de /actuator/hystrix.stream:

localhost:9191/actuator/hystrix.stream

Esta aplicação também está habilitada para operar em conjunto com Zipkin. Acesse zipkin.io e clique em Quickstart. Baixe o arquivo .jar e abra através do terminal com o comando:

java -jar nome_do_arquivo_baixado.jar

Ao carregar, copie o link e abra no servidor, adicionando /zipkin/ no final. Ex:

000.0.0.0:0000/zipkin/



Dependências (por serviço)

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



Referência:
https://javatechonline.com/microservices-in-java/#What_is_Service_Registration_Discovery