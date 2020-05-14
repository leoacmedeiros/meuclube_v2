#language: pt
@AlterarSituacaoBeneficiario
Funcionalidade: Manter Beneficiario

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Altearar Situação Beneficiario
    Dado que o usuário acesse o menu para altear a situação de um beneficiario
    Quando alterar a situação beneficiário
      | beneficiario | Kamilly Beatriz Daniela Gonçalves |
    Então será alterado a situação do beneficiario
