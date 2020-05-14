#language: pt
@AlterarDiaDebito
Funcionalidade: Manter Forma de Pagamento

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Alterar o dia de débito do título
    Dado que o usuário acesse o menu para alterar a forma de pagamento
    Quando alterar o título
      | titulo | 350634 |
    E selecionar outra dia de débito
      | novo dia debito | 20 |
    E alterar
    Então será modificado o dia de débito do título
