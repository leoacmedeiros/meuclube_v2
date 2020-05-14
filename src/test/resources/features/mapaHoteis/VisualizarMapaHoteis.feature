#language: pt
@VisualizarMapaHoteis
Funcionalidade: Visualizar Geolocalização dos Hotéis

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Geolocalização dos Hotéis de um Destino
    Dado que eu realize uma pesquisa por localidade
      | cidade/uf | SAO PAULO |
    Quando clicar para visualizar mapa
    Então será exibido no mapa os hotéis da localidade pesquisada
