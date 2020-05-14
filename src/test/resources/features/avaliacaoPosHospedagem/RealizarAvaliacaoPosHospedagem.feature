#language: pt
@RealizarAvaliacaoPosHospedagem
Funcionalidade: Realizar Avaliação Pós Hospedagem

  Contexto: Como usuário desejo avaliar a hospedagem
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Realizar Avaliação Pós Hospedagem
    Dado que acesse o menu Minhas Reservas para realizar a Avaliação Pós Hospedagem
    E selecione uma Hospedagem para realizar a Avaliação da Experiência
    E na pergunta 1 - Qual o seu grau de satisfação das instalações do hotel marque as estrelas das opções
      | Recepção / Hall de Entrada | Selecionar qtd de estrelas |
      | Restaurante                | Selecionar qtd de estrelas |
      | Piscina                    | Selecionar qtd de estrelas |
      | Área de Lazer              | Selecionar qtd de estrelas |
    E na pergunta 2 - Qual o seu grau de satisfação com os serviços prestados pelo hotel? marque as estrelas das opções
      | Recepção: Check-in e Check-out | Selecionar qtd de estrelas |
      | Apartamento: Higiene e Limpeza | Selecionar qtd de estrelas |
      | Apartamento: Serviço de Quarto | Selecionar qtd de estrelas |
      | Banheiro: Higiene e Limpeza    | Selecionar qtd de estrelas |
      | Restaurante: Café da Manhã     | Selecionar qtd de estrelas |
      | Restaurante: Outras Refeições  | Selecionar qtd de estrelas |
    E na pergunta 3 - Em relação ao apartamento utilizado, qual o seu grau de satisfação? marque as estrelas das opções
      | Ambiente/Conforto              | Selecionar qtd de estrelas |
      | Enxoval (Cama e Banho)         | Selecionar qtd de estrelas |
      | Mobiliário                     | Selecionar qtd de estrelas |
      | Funcionamento dos Equipamentos | Selecionar qtd de estrelas |
    E na pergunta 4 - Qual o seu grau de satisfação com o atendimento dos funcionários do hotel? marque as estrelas das opções
      | Simpatia e Profissionalismo         | Selecionar qtd de estrelas |
      | Agilidade na Resolução de Problemas | Selecionar qtd de estrelas |
      | Conhecimento dos serviços           | Selecionar qtd de estrelas |
    E na pergunta 5 - Em geral, como você avaliaria a sua hospedagem? marque as estrelas das opções
      | EM GERAL, COMO VOCÊ AVALIARIA A SUA HOSPEDAGEM? | Selecionar qtd de estrelas |
    E na pergunta 6 - Poderia nos informar qual numero do quarto? informar o número
      | Poderia nos Informar Qual Numero do Quarto? | 301 |
    E na pergunta 7 - Caso deseje fazer comentários, use o campo abaixo. Selecionar a opção e inserir um comentário
      | Caso deseje fazer comentários, use o campo abaixo | Elogio                                               |
      | Caso deseje fazer comentários, use o campo abaixo | Gostei da hospedagem, muito boa. Voltarei mais vezes |
    E na pergunta 8 - Teria algum colaborador a ser elogiado? Inserir o nome do colaborador
      | Teria algum colaborador a ser elogiado? | Claudionor da Portaria |
    Quando clicar no botão de Enviar
    Então o sistema irá armazenar a avaliação
