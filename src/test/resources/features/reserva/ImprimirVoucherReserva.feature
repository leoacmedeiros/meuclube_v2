#language: pt
@ImprimirVoucherReserva
Funcionalidade: Imprimir Voucher Reserva

  Contexto: Como usuário desejo Incluir uma Reserva e Imprimir o Voucher
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Imprimir Voucher
    Dado que acesse a página inicial e realize uma pesquisa por Hotel
      | Hotel | COMFORT HOTEL TAGUATINGA AHI |
    E nos detalhes do hotel selecione a Data de Início e Fim
    E clique em Buscar Período Selecionado
    E selecione a opção Continuar
    E informe a quantidade de diárias
      | Número diárias | 1 |
    E verifique se tem alguma promoção e caso tenha clicar para aceitar
    E clique para aceitar os termos e políticas para a reserva
    E acione a o botão para Reservar
    Então irá exibir a mensagem de confirmação da Reserva
    E acione o menu Minhas Reservas para verificar a confirmação da Reserva
    E clique em Detalhes para detalhar a Reserva do hotel da pesquisa
      | Hotel (Tem que ser o mesmo da pesquisa) | COMFORT HOTEL TAGUATINGA AHI |
    E clique para Imprimir o Voucher
    Então o sistema irá gerar o Voucher
