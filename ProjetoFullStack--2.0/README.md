## StockMarket

Java RESTful API baseada no Santander Dev Week 2023.

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class Investor {
    -String name
    -Account account
    -Stock[] stocks
    -ETF[] etfs
    -FII[] fiis
  }

  class Account {
    -String accountId
    -Number balance
    -Number margin
  }

  class Stock {
    -String tickerSymbol
    -Number quantity
    -Number purchasePrice
  }

  class ETF {
    -String fundName
    -Number sharesOwned
    -Number purchasePrice
  }

  class FII {
    -String name
    -Number investmentAmount
    -String investmentStrategy
  }

  Investor "1" *-- "1" Account
  Investor "1" *-- "N" Stock
  Investor "1" *-- "N" ETF
  Investor "1" *-- "N" FII

```
