#language:pt

@login
Funcionalidade: Menu
  Eu como usuario do app
  Pretendo acessar os menus
  Para visualizar todas as funcionalidades

    @loginInvalido
    Cenario: Abre API Demos
    	Dado que acessei o API Demos
      Quando eu clicar em Acessibility
      Entao visualizarei os sub menus de Acessibility
