#language: pt
@DicasDestinos
Funcionalidade: Verificar Dicas de Destinos

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Verificar Dicas de Destino
    Dado que o usuário esteja na tela inicial
    Quando visualizar os melhores quartos e hotéis contidos no Título Superior
    E as Novidades do Clube
    E onde as diárias valem mais
    Então os hóteis serão apresentados
