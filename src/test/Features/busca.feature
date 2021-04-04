#language: pt
  Funcionalidade: Cursos

    @regressivo @avista
    Esquema do Cenario: Valida se valor do curso a vista contido na lista é igual ao valor da página de detalhes
      Dado que acesso a homepage do estratégia concursos
      E clico no link 'por professores'
      E preencho o campo busca com o nome do professor Ena Loiola
      E acesso a página lista dos cursos
      Quando escolho o curso <curso> e armazeno o valor da lista
      Então valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE
      Exemplos:
      |curso                                                         |
      |Assinatura Básica 1 Ano - Boleto à vista com 10% de desconto  |
      |Assinatura Básica 2 Anos - Boleto à vista com 10% de desconto |
      |Assinatura Premium 1 Ano - Boleto à vista com 10% de desconto |
      |Assinatura Premium 2 Anos - Boleto à vista com 10% de desconto|

      @regressivo @parcelado
      Esquema do Cenario: Valida se valor do curso parcelado contido na lista é igual ao valor total na páginade detalhes
      Dado que acesso a homepage do estratégia concursos
      E clico no link 'por professores'
      E preencho o campo busca com o nome do professor Ena Loiola
      E acesso a página lista dos cursos
      Quando escolho o curso <curso> e armazeno o valor da lista
      Então valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE
      Exemplos:
      |curso                                                   |
      |Assinatura Premium 1 Ano - Cartão até 12 x              |
      |Assinatura Básica 1 Ano - Cartão até 12 x               |
      |Assinatura Corujinha Social - Cartão                    |
      |ANS (Analista Administrativo) Inglês 2021 (Pré-Edital)  |

      @regressivo @validaquantidadecursos
      Cenário: Valida quantidade exibida na página de busca por professor com a página da lista de cursos do professor
      Dado que acesso a homepage do estratégia concursos
      E clico no link 'por professores'
      E preencho o campo busca com o nome do professor Ena Loiola
      Quando acesso a página lista dos cursos por professor
      Então verifico que a quantidade de cursos disponíveis são iguais





