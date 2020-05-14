#language: pt
@FiltrarResultadosRefinarBusca
Funcionalidade: Filtrar Resultados Refinar Busca

  Contexto: Como usuário desejo pesquisar uma Hospedagem e selecionar os filtros para refinar a busca
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Filtrar Resultados Refinar Busca
    Dado que eu realize uma pesquisa válida na página inicial pela Capital
      | Digite a UF, cidade ou hotel | RIO DE JANEIRO |
    E na tela com os resultados da pesquisa selecione os filtros para refinar a busca
    Quando clicar no filtro Academia
    Então deverá exibir os resultados do filtro Academia
    Quando clicar no filtro Ar-condicionado
    Então deverá exibir os resultados do filtro Ar-condicionado
    Quando clicar no filtro Baby Copa
    Então deverá exibir os resultados do filtro Baby Copa
    Quando clicar no filtro Brinquedoteca
    Então deverá exibir os resultados do filtro Brinquedoteca
    Quando clicar no filtro Calefação
    Então deverá exibir os resultados do filtro Calefação
    Quando clicar no filtro Cama extra
    Então deverá exibir os resultados do filtro Cama extra
    Quando clicar no filtro Cofre
    Então deverá exibir os resultados do filtro Cofre
    Quando clicar no filtro Cozinha
    Então deverá exibir os resultados do filtro Cozinha
    Quando clicar no filtro Criança acomodada em cama extra
    Então deverá exibir os resultados do filtro Criança acomodada em cama extra
    Quando clicar no filtro Criança acomodada na cama dos pais
    Então deverá exibir os resultados do filtro Criança acomodada na cama dos pais
    Quando clicar no filtro Elevador
    Então deverá exibir os resultados do filtro Elevador
    Quando clicar no filtro Estacionamento
    Então deverá exibir os resultados do filtro Estacionamento
    Quando clicar no filtro Frigobar
    Então deverá exibir os resultados do filtro Frigobar
    Quando clicar no filtro Internet
    Então deverá exibir os resultados do filtro Internet
    Quando clicar no filtro Kids Club
    Então deverá exibir os resultados do filtro Kids Club
    Quando clicar no filtro Micro-ondas
    Então deverá exibir os resultados do filtro Micro-ondas
    Quando clicar no filtro Permite Animais
    Então deverá exibir os resultados do filtro Permite Animais
    Quando clicar no filtro Piscina
    Então deverá exibir os resultados do filtro Piscina
    Quando clicar no filtro Piso Frio
    Então deverá exibir os resultados do filtro Piso Frio
    Quando clicar no filtro Quarto Adaptado
    Então deverá exibir os resultados do filtro Quarto Adaptado
    Quando clicar no filtro Restaurante
    Então deverá exibir os resultados do filtro Restaurante
    Quando clicar no filtro Sala de Jogos
    Então deverá exibir os resultados do filtro Sala de Jogos
    Quando clicar no filtro Serviço de piscina
    Então deverá exibir os resultados do filtro Serviço de piscina
    Quando clicar no filtro Serviço de praia
    Então deverá exibir os resultados do filtro Serviço de praia
    Quando clicar no filtro Serviço de praia/piscina
    Então deverá exibir os resultados do filtro Serviço de praia/piscina
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
