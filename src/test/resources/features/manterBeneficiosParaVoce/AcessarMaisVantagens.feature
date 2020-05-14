#language: pt
@MaisVantagens
Funcionalidade: Manter Programa Mais Vantagens

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Acessar Mais Vantagens
    Dado que o usuário acesse o menu Benefícios para você
    Quando clicar na aba do programa Mais Vantagens
    E obter Mais Informações
    Então será direcionado para a tela do programa Mais Vantagens
