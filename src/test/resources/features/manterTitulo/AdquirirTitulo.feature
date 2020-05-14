#language: pt
@AdquirirTitulo
Funcionalidade: Manter Títulos

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Adquirir Novo Título
    Dado que o usuario acesse o menu para aquisição de títulos
    E crie uma nova proposta
    Quando informar a categoria e quantidade de títulos que deseja adquirir
      | categoria  | Executivo 2 |
      | quantidade |           1 |
    Então prosseguir
    Quando selecionar os dados para pagamento
      | meio de pagamento | BANCO DO BRASIL |
      | agencia           | 1230-0          |
      | conta corrente    | 88.301.297-9    |
      | final cartao      |            3290 |
    E selecionar o dia de débito
      | dia debito | 20 |
    E avançar e aceitar os termos de uso
    Então será criada a proposta
