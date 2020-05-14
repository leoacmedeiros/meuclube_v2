#language: pt
@ListaHoteisPorCidade
Funcionalidade: Listagem de Hotéis por Cidade

  Contexto: Como usuário desejo pesquisar Hotéis por Cidade
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Listar Hotéis por Cidade
    Dado que eu realize a pesquisa por São Paulo
      | Cidade1 | SAO PAULO |
    Então o sistema apresentará a lista de hotéis por São Paulo
    E realize a pesquisa por Maceió
      | Cidade2 | MACEIO |
    Então o sistema apresentará a lista de hotéis por Maceió
    E realize a pesquisa por Salvador
      | Cidade3 | SALVADOR |
    Então o sistema apresentará a lista de hotéis por Salvador
    E realize a pesquisa por São Luis
      | Cidade4 | SAO LUIS |
    Então o sistema apresentará a lista de hotéis por São Luis
    E realize a pesquisa por Caldas Novas
      | Cidade5 | CALDAS NOVAS |
    Então o sistema apresentará a lista de hotéis por Caldas Novas
    E realize a pesquisa por Fortaleza
      | Cidade6 | FORTALEZA |
    Então o sistema apresentará a lista de hotéis por Fortaleza
    E realize a pesquisa por Recife
      | Cidade7 | RECIFE |
    Então o sistema apresentará a lista de hotéis por Recife
