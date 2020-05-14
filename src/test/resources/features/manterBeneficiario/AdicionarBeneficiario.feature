#language: pt
@AdicionarBeneficiario
Funcionalidade: Manter Beneficiario

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Adicionar Beneficiario
    Dado que o usuário acesse o menu afim de adicionar um beneficiario
    Quando preencher o formulario
      | nome completo    | Kamilly Beatriz Daniela Gonçalves |
      | vinculo          | Outros                            |
      | cpf              | 716.303.168-81                    |
      | data nascimento  | 01/08/1965                        |
      | e-mail           | kamillybeatriz@inbox.com          |
      | telefone celular | (86) 99896-3652                   |
    E salvar o beneficiario
    Então será adicionado o novo beneficiario
