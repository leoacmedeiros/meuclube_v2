#language: pt
@AVerificarDadosContato
Funcionalidade: Manter Dados de Contato com a Central de Atendimento

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

    Cenário: Veriifcar Dados de Contato com a Central de Atendimento
    Dado que o usuário acesse o menu para verificar os dados de contato da Central de Atendimento
    Então será apresentado as informações da Central de Atendimento