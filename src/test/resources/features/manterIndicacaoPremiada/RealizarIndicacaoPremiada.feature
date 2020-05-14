#language: pt
@RealizarIndicacao
Funcionalidade: Manter Indicação Premiada

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Indicação Premiada
    Dado que o usuário acesse o menu para realizar uma indicação
    Quando clicar no card
    Então será direcionado para a tela do programa
    Quando preencher o formulario de indicação
      | tipo pessoa | Física                                       |
      | nome        | Sophia Marli Lúcia Monteiro                  |
      | email       | ssophiamarliluciamonteiro@3coreonline.com.br |
      | documento   | 181.072.008-70                               |
      | telefone    | (84) 3654-9070                               |
      | celular     | (84) 98731-4895                              |
      | uf          | Rio Grande do Norte                          |
