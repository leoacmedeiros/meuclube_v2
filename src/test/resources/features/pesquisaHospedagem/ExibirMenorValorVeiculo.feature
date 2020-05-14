#language: pt
@ExibirMenorValorVeiculo
Funcionalidade: Exibir Menor Valor Veículo

  Contexto: Como usuário desejo pesquisar Hotéis e após a pesquisa exibir menor valor de veículo no resultado da disponibilidade do hotel
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Exibir menor valor da locação de veículo após pesquisa
    Dado que eu realize umaa consulta na página inicial por nome da Cidade e Data
      | Cidade | RIO DE JANEIRO        |
      | Data   | selecionado na função |
    E acione o botão aplicar para realizar a pesquisa
    Então na lista de resultados de hotéis o sistema apresenta o menor valor de locação de veículo
