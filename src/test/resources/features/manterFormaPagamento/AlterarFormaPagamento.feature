#language: pt
@AdicionarFormaPagamento
Funcionalidade: Manter Forma de Pagamento

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Alterar forma de pagamento de título
    Dado que o usuário acesse o menu para alterar a forma de pagamento
    Quando alterar o título
      | titulo | 350634 |
    E selecionar outra forma de pagamento
      | tipo pagamento  | Débito              |
      | banco           | BANCO DO BRASIL     |
      | agencia         | 5190-X              |
      | conta corrente  | 9.110-3             |
      | numero cartao   | 5159.2501.7884.8908 |
      | validade cartao | 04/2021             |
    E alterar
    Então será modificado a forma de pagamento do título
