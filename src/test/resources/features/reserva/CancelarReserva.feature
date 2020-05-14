#language: pt
@CancelarReserva
Funcionalidade: Cancelar Reserva

  Contexto: Como usuário desejo cancelar uma reserva
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Cancelar Reserva
    Dado que acesse o menu Minhas Reservas 
    E detalhe uma reserva que esteja confirmada 
    E clique no botão de Cancelar Reserva
    E preenche os dados para realizar o cancelamento
    Então minha reserva será cancelada
