# language: pt
@AlterarPeriodo
Funcionalidade: Manter Período de Utilização de Título

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Efetuar Alteração do Período de Utilização do Título
    Dado que o usuário acesse o menu para alterar o período de utilização do título
    Quando alterar o período do título selecionado
      | titulo         |        350634 |
    E avançar
    E confirmar a alteração do período do título
    Então será criado a solicitação de alteração do período do título
