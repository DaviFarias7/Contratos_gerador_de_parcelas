## Conceitos utilizados na implementação do programa

- Composição de entidades
- Composição de serviços
- Interfaces
- Inversão de controle / injeção de dependência


## Descrição do programa

Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.

A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.

Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato). Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.

## Exemplo de entrada de dados

![example](https://user-images.githubusercontent.com/86566715/145918710-9cf52760-b07b-442c-ab6d-89e1cf9be59f.png)

## Cálculos das parcelas

Parcela #1: 
200 + 1% * 1 = 202 => 
202 + 2% = 206.04

Parcela #2: 
200 + 1% * 2 = 204 => 
204 + 2% = 208.08

Parcela #3: 
200 + 1% * 3 = 206 => 
206 + 2% = 210.12

## DIAGRAMAS

## Entidades

![entities](https://user-images.githubusercontent.com/86566715/145919113-430a80ce-c96c-42cb-927c-4a4e5b375352.png)

## Serviços

![services](https://user-images.githubusercontent.com/86566715/145919284-0de6af33-5959-4683-89cd-6512e7ca6be1.png)
