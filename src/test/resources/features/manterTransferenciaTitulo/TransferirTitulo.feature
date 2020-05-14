#language: pt
@TransferirTitulo
Funcionalidade: Manter Transferência de Título

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Efetuar transferencia de Título
    Dado que o usuário acesse o menu para transferir títulos
    Quando selecionar o título que deseja transferir
      | titulo | 350634 |
    E informar os dados para quem quer transferir
      | tipo pessoa      | Pessoa Física            |
      | cpf/cnpj         | 716.303.168-81           |
      | nome             | Pessoa                   |
      | orgao expedidor  | SSP                      |
      | rg               | 17.517.993-1             |
      | data nascimento  | 01/08/1965               |
      | sexo             | Feminino                 |
      | estado civil     | Casado                   |
      | telefone celular | (86) 99896-3652          |
      | telefone         | (86) 2708-7495           |
      | email            | kamillybeatriz@inbox.com |
      | cep              | 77060-318                |
      | complemento      | Casa                     |
      | naturalidade     | Brasília                 |
      | uf               | DF                       |
    E informar os dados para pagamento
      | tipo pagamento | Cartão de Crédito   |
      | banco          | SANTANDER           |
      | agencia        |                0816 |
      | conta          | 01015052-9          |
      | numero cartao  | 5159.2501.7884.8908 |
      | validade mes   |                  02 |
      | validade ano   |                2021 |
      | dia debito     |                  20 |
    E inserir observações
      | observações | Observações da automação - Funcionalidade transferir título |
    E avançar
    E confirmar Transferência de título
    Então será criado o termo para Transferir o título
