#language: pt
@OrdenacaoPersonalizada
Funcionalidade: Listar Hotéis por Cidade e ordená-los

  Contexto: Como usuário desejo pesquisar Hotéis por Cidade e realizar a ordenação dos resultados
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Classificar, ordenar, hotéis por confirmação imediata, menor preço, melhor avaliação e nome hotel
    Dado que realize uma pesquisa pelo nome da cidade na página inicial por Florianópolis
      | Cidade1 | FLORIANOPOLIS |
    E na lista de resultados por Florianópolis faça a ordenação por
      | Ordenação1 | Confirmação imediata |
      | Ordenação2 | Menor preço          |
      | Ordenação3 | Melhor avaliação     |
      | Ordenação4 | Nome hotel           |
    E que realize uma pesquisa pelo nome da cidade na página inicial por Aracaju
      | Cidade2 | ARACAJU |
    E na lista de resultados por Aracaju faça a ordenação por
      | Ordenação1 | Confirmação imediata |
      | Ordenação2 | Menor preço          |
      | Ordenação3 | Melhor avaliação     |
      | Ordenação4 | Nome hotel           |
    E que realize uma pesquisa pelo nome da cidade na página inicial por Porto Seguro
      | Cidade3 | PORTO SEGURO |
    E na lista de resultados por Porto Seguro faça a ordenação por
      | Ordenação1 | Confirmação imediata |
      | Ordenação2 | Menor preço          |
      | Ordenação3 | Melhor avaliação     |
      | Ordenação4 | Nome hotel           |
    Então o sistema irá realizar a ordenação corretamente
