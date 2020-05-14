#language: pt
@DetalharReservaPaginaInicial
Funcionalidade: Detalhar Reserva Página Inicial

  Contexto: Como usuário desejo Detalhar uma Reserva
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Detalhar Reserva Página Inicial
    Dado que eu clique no botão de Detalhes da Reserva na Página Inicial
    Então exibirá os detalhes da Reserva
