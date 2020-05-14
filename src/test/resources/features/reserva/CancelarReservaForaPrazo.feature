#language: pt
@CancelarReserva
Funcionalidade: Cancelar Reserva Fora do Prazo

  Contexto: Como usuário desejo cancelar uma Reserva Fora do Prazo
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Cancelar Reserva Fora do Prazo
    Dado que acesse o menu Minhas Reservas 
    E detalhe uma reserva que esteja confirmada fora do prazo de cancelamento 
    E selecione a opção de Cancelar Reserva
    E selecione a quantidade de diárias da cobrança de penalidade
    E clique para aceitar as condições da penalidade
    Quando solicitar o cancelamento da reserva
    Então minha reserva será cancelada com sucesso
