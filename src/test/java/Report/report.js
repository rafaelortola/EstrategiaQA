$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/rafae/Desktop/DesafioEstrategia/src/test/Features/busca.feature");
formatter.feature({
  "name": "Cursos",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Valida se valor do curso a vista contido na lista é igual ao valor da página de detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@avista"
    }
  ]
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.step({
  "name": "escolho o curso \u003ccurso\u003e e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.step({
  "name": "valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "curso"
      ]
    },
    {
      "cells": [
        "Assinatura Básica 1 Ano - Boleto à vista com 10% de desconto"
      ]
    },
    {
      "cells": [
        "Assinatura Básica 2 Anos - Boleto à vista com 10% de desconto"
      ]
    },
    {
      "cells": [
        "Assinatura Premium 1 Ano - Boleto à vista com 10% de desconto"
      ]
    },
    {
      "cells": [
        "Assinatura Premium 2 Anos - Boleto à vista com 10% de desconto"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valida se valor do curso a vista contido na lista é igual ao valor da página de detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@avista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Básica 1 Ano - Boleto à vista com 10% de desconto e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValores()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida se valor do curso a vista contido na lista é igual ao valor da página de detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@avista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Básica 2 Anos - Boleto à vista com 10% de desconto e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValores()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida se valor do curso a vista contido na lista é igual ao valor da página de detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@avista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Premium 1 Ano - Boleto à vista com 10% de desconto e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValores()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida se valor do curso a vista contido na lista é igual ao valor da página de detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@avista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Premium 2 Anos - Boleto à vista com 10% de desconto e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValores()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Valida se valor do curso parcelado contido na lista é igual ao valor total na páginade detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@parcelado"
    }
  ]
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.step({
  "name": "escolho o curso \u003ccurso\u003e e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.step({
  "name": "valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "curso"
      ]
    },
    {
      "cells": [
        "Assinatura Premium 1 Ano - Cartão até 12 x"
      ]
    },
    {
      "cells": [
        "Assinatura Básica 1 Ano - Cartão até 12 x"
      ]
    },
    {
      "cells": [
        "Assinatura Corujinha Social - Cartão"
      ]
    },
    {
      "cells": [
        "ANS (Analista Administrativo) Inglês 2021 (Pré-Edital)"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valida se valor do curso parcelado contido na lista é igual ao valor total na páginade detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@parcelado"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Premium 1 Ano - Cartão até 12 x e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValoresParcelados()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida se valor do curso parcelado contido na lista é igual ao valor total na páginade detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@parcelado"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Básica 1 Ano - Cartão até 12 x e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValoresParcelados()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida se valor do curso parcelado contido na lista é igual ao valor total na páginade detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@parcelado"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso Assinatura Corujinha Social - Cartão e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValoresParcelados()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida se valor do curso parcelado contido na lista é igual ao valor total na páginade detalhes",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@parcelado"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.acessarCursosE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o curso ANS (Analista Administrativo) Inglês 2021 (Pré-Edital) e armazeno o valor da lista",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.escolherCurso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaValoresParcelados()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valida quantidade exibida na página de busca por professor com a página da lista de cursos do professor",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@regressivo"
    },
    {
      "name": "@validaquantidadecursos"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a homepage do estratégia concursos",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessarHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \u0027por professores\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.linkPorProfessores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo busca com o nome do professor Ena Loiola",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.preecherCampoBuscaProfessor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a página lista dos cursos por professor",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.acessarCursosQuando()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifico que a quantidade de cursos disponíveis são iguais",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.verificaQuantidadeDeCursosDisponiveis()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: ERRO - O Valor contido na página de busca por professor não está igual ao total de cursos contido na página da lista de cursos. \n Valor Página Professor: 89 cursos disponíveis\n Valor Página Lista Cursos: 112 cursos disponíveis\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat StepsDefinitions.Steps.verificaQuantidadeDeCursosDisponiveis(Steps.java:342)\r\n\tat ✽.verifico que a quantidade de cursos disponíveis são iguais(C:/Users/rafae/Desktop/DesafioEstrategia/src/test/Features/busca.feature:40)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});