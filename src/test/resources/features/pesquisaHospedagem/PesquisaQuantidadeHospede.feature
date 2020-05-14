#language: pt
@PesquisaQuantidadeHospede
Funcionalidade: Pesquisa de disponibilidade: quantidade de hóspedes e resultados de quartos

  Contexto: Como usuário desejo realizar pesquisa selecionando vários hóspedes e quartos
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Realizar pesquisa inserindo vários hóspedes e quartos
    Dado que insira uma nome da Cidade para pesquisar
      | Cidade | FORTALEZA |
    E no campo de pesquisa de quartos e hóspedes informe a quantidade de adultos, menores de 17 anos e idade dos menores no quarto 1
      | Adultos            | 2 |
      | Menores de 17 anos | 2 |
      | Idade Menor 1      | 4 |
      | Idade Menor 2      | 3 |
    E acione a opção de Adicionar Quarto
    E informe a quantidade de adultos, menores de 17 anos e idade do menor no quarto 2
      | Adultos            | 3 |
      | Menores de 17 anos | 1 |
      | Idade Menor 1      | 4 |
    E acione a opção de Adicionar mais um Quarto
    E informe a quantidade de adultos, menores de 17 anos e idade dos menores no quarto 3
      | Adultos            | 1 |
      | Menores de 17 anos | 2 |
      | Idade Menor 1      | 3 |
      | Idade Menor 2      | 5 |
    E clique no botão para Fechar as opções de adição dos quartos
    E clique no botão Aplicar para realizar a pesquisa
    Então o sistema irá exibir os resultados dos hotéis disponíveis para a pesquisa realizada
