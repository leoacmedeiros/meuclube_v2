#language: pt
@MarcacaoExtraBloqueio
Funcionalidade: Marcação Extra Bloqueio

  Contexto: Como usuário desejo realizar uma Marcação de Reserva Extra Bloqueio
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Marcação Reserva Extra Bloqueio
    Dado que eu realize uma pesquisa válida na página inicial por
      | Cidade | RIO DE JANEIRO |
      | Data   | Hoje           |
    E selecione Ver Quartos de um Hotel que esteja com a situação
      | Situação | Mediante consulta ao hotel |
    E na tela de detalhes da disponibilidade clique no botão Continuar
    E verifique se há promoção no hotel para a data selecionada
    E informe a quantidade de diárias para a categoria do título
    E clique para aceitar os temos e políticas para reserva
    Quando clicar no botão para Solicitar a Reserva
    Então o sistema irá apresentar a mensagem
      | Mensagem | Ops! A sua reserva ainda não foi confirmada. |
