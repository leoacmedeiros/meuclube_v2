#language: pt
@ExibirMenorValorVoo
Funcionalidade: Exibir menor valor de voo no resultado da disponibilidade do hotel

  Contexto: Como usuário desejo pesquisar Hotéis e após a pesquisa exibir menor valor de voo no resultado da disponibilidade do hotel
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Exibir menor valor de voo após pesquisa
    Dado que eu realize a consulta na página inicial por nome da Cidade e Data
      | Cidade | ARACAJU               |
      | Data   | selecionado na função |
    E acione a pesquisa
    Então na lista de resultados de hotéis o sistema apresenta o menor valor de voo
