#language: pt
@DetalharReserva
Funcionalidade: Detalhar Reserva

  Contexto: Como usuário desejo Detalhar uma Reserva
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Detalhar Reserva
    Dado que acesse o menu das Minhas Reservas
    E detalhe uma reserva que já esteja confirmada
    Então deverá apresentar os detalhes da Reserva
