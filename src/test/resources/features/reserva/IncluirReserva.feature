#language: pt
@IncluirReserva
Funcionalidade: Incluir Reserva

  Contexto: Como usuário desejo incluir uma reserva
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Reserva
    Dado que eu realize uma pesquisa válida na página inicial com os seguintes parâmetros
      | Digite a UF, cidade ou hotel | ARACAJU |
      | Selecionar data              |         |
    E clique no botão de Ver Quartos
    E clique no botão de continuar
    E selecione a quantidade de diárias
    E aceite os temos e políticas para reserva
    Quando clicar no botão Reservar
    Então minha reserva será confirmada
