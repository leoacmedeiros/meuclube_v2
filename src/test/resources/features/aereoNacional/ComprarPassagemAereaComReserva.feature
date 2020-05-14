#language: pt
@ComprarPassagemAereaComReserva
Funcionalidade: Comprar Passagem Aérea com Reserva

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Comprar Passagem Aérea com Reserva
    Dado que o usuário clique em voos para comprar passagem aérea nacional
    E escolha a opção para comprar passagem com 30% de desconto
    E escolha a reserva para a qual deseja comprar a passagem
    E selecione o aeroporto de destino e clique em confirmar
    E clique em próximo para avançar para a tela Origem/Destino
    Então irá exibir a tela de origem e destino
    E selecione o aeroporto de origem
      | Aeroporto Origem | Brasilia |
    E selecione a quantidade de passageiros
      | Adultos  | 1 |
      | Crianças | 1 |
    E clique em próximo para avançar para a tela Trecho
    Então irá exibir as cotações das companhias aéreas
    E selecione os trechos de ida e volta
    E clique para selecionar
    E escolha o pacote e clique em comprar
    Então irá exibir os detalhes da compra
    E preencha os dados do passageiro Adulto
      | CPF                | GeraAuto      |
      | Primeiro Nome      | Sara          |
      | Ultimo Nome        | Malu da Cunha |
      | Sexo               | Feminino      |
      | Data de Nascimento |      01051970 |
      | E-mail             | geraEmailAuto |
      | Telefone Celular   |   61994887744 |
    E preencha os dados do passageiro Criança
      | Primeiro Nome      | Vinicius                 |
      | Ultimo Nome        | Medeiros                 |
      | Sexo               | Masculino                |
      | Data de Nascimento |                 28062014 |
      | E-mail             | vinimedeiros28@gmail.com |
      | Telefone Celular   |              61999421487 |
    E clique na opção estou ciente das regras acima
    E clique no botão informe os dados de pagamento
    Então irá exibir o formulário dos dados do pagante
    E preencher os dados do pagante
      | CPF                  |                          57259966033 |
      | Primeiro Nome        | Julia                                |
      | Ultimo Nome          | Betina Nair Gomes                    |
      | Sexo                 | Feminino                             |
      | Data de Nascimento   |                             05091991 |
      | Telefone Celular     |                          61912001569 |
      | E-mail               | juliabetinanairgomes@andrelam.com.br |
      | Confirmação E-mail   | juliabetinanairgomes@andrelam.com.br |
      | CEP                  |                             79106072 |
      | Numero Endereço      |                                   10 |
      | Complemento Endereço | Avenida Peixoto Sales                |
      | Cartão               | Visa                                 |
      | Titulo do Cartão     | Julia Betina Nair Gomes              |
      | Numero Cartão        |                     4024007154640170 |
      | Codigo Segurança     |                                  741 |
      | Validade Mes         |                                   01 |
      | Validade Ano         |                                 2021 |
    Quando clicar no botão Parcelar
    Então irá exibir a quantidade de parcelas
    E selecionar a quantidade de parcelas
    E clicar no botão de Regras
    E clicar para aceitar as regras tarifárias
    E clicar no botão Aceitar
    Quando clicar no botão Comprar
    Então irá finalizar a compra da passagem aérea
