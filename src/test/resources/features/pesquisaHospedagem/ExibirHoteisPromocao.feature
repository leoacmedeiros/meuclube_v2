#language: pt
@ExibirHoteisPromocao
Funcionalidade: Exibir Hotéis com Promoção

  Contexto: Exibir Meu Clube
   Dado que eu acesse o sistema Meu Clube
   Quando informar os dados de logon
     | Usuário | 812.236.091-20 |
     | Senha   |           0000 |
   Então deverá exibir a tela inicial do sistema

  Cenário: Exibir Hotéis com Promoção
    Dado que eu realize uma pesquisa
      | cidade/uf | RIO DE JANEIRO |
    Quando refinar a busca por hóteis que estejam com Promoção
    Então serão exibidos hóteis que possuem promoção ativa
