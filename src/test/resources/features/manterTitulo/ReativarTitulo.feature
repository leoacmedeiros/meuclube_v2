#language: pt
@ReativaTitulo
Funcionalidade: Manter Título

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Reativar Título
    Dado que o usuário acesse o menu para reativar um título cancelado
    Quando selecionar o título
      | titulo | 97670 |
    E selecionar forma de pagamento
      | tipo pagamento  | Débito              |
      | banco           | BANCO DO BRASIL     |
      | agencia         | 5190-X              |
      | conta corrente  | 9.110-3             |
      | numero cartao   | 5159.2501.7884.8908 |
      | validade cartao | 02/2020             |
    E selecionar dia de débito
      | dia debito | 20 |
    E aceitar termo de ciencia
    Então será criado a solicitação para reativar o título
