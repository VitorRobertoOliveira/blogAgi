# language: pt
Funcionalidade: CT01-CampoDeBusca

  @cenario01
  Cenario: CT01-CampoDeBusca
    Dado que eu acesse a url "https://blogdoagi.com.br/"
    Quando eu preencher o campo de busca
    E clicar em pesquisar
    Então devo receber o resultado da busca conforme esperado