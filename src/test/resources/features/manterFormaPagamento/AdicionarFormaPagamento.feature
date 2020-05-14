#language: pt
@AdicionarFormaPagamento
Funcionalidade: Manter Forma de Pagamento

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Adicionar nova forma de pagamento
    Dado que o usuário acesse o menu para cadastrar uma nova forma de pagamento
    Quando alterar o título
      | titulo | 350634 |
    E adicionar nova forma de pagamento
      | tipo pagamento | Cartão              |
      | banco          | ITAÚ                |
      | agencia        |                3116 |
      | conta          | 73548-5             |
      | numero cartao  | 5443 4975 7243 0413 |
      | validade mes   |                  04 |
      | validade ano   |                2021 |
    E adicionar
    Então será adicionado a nova forma de pagamento
