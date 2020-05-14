#language: pt
@AlterarReserva
Funcionalidade: Alterar Reserva

  Contexto: Como usuário desejo Alterar uma Reserva
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Alterar Reserva
    Dado que acesse o menu Minhas Reservas 
    E selecione uma reserva que esteja com a situação Reserva Confirmada
    E selecione a opção Alterar Reserva 
    Quando informar os dados para Alteração
    Então o sistema irá salvar os dados alterados
