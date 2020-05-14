#language: pt
@AdquirirDiariaAvulsaReserva
Funcionalidade: Adquirir Diária Avulsa

  Contexto: Como usuário desejo Adquirir Diárias Avulsas na Reserva
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Adquirir Diária Avulsa
    Dado que eu realize uma pesquisa de Hotel para adquirir uma Reserva
      | Nome Hotel | COMFORT HOTEL TAGUATINGA AHI |
    E selecione a Data Inicial e a Data Final para confirmar a Reserva
    E clique no botão para Buscar o Período Selecionado
    E na tela de detalhes da Reserva clique em Continuar
    E informe a quantidade de Diárias Avulas que desejo adquirir
      | Qtd de Diárias Avulas | 1 |
    E verifique se tem alguma promoção para aceitar
    E selecione o número de parcelas das Diárias Avulsas para pagamento
      | Qtd de parcelas | 4 parcela |
    E aceite os temos e políticas
    E clique no botão Reservar para finalizar a Reserva
    Então exibirá mensagem de confirmação da Reserva
