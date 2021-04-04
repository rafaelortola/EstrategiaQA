package Enums;

public enum CursosEnum {
    CURSO_ENA_1("Assinatura Básica 1 Ano - Cartão até 12 x", "https://www.estrategiaconcursos.com.br/curso/assinatura-basica-1-ano-cartao-ate-12-x/","#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(1) > div"),
    CURSO_ENA_2("Assinatura Básica 1 Ano - Boleto à vista com 10% de desconto","https://www.estrategiaconcursos.com.br/curso/assinatura-basica-1-ano-boleto-a-vista-com-10-de-desconto/","#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(2) > div"),
    CURSO_ENA_4("Assinatura Básica 2 Anos - Boleto à vista com 10% de desconto","https://www.estrategiaconcursos.com.br/curso/assinatura-basica-2-anos-boleto-a-vista-com-10-de-desconto/","#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(4) > div"),
    CURSO_ENA_6("Assinatura Premium 1 Ano - Boleto à vista com 10% de desconto", "https://www.estrategiaconcursos.com.br/curso/assinatura-premium-1-ano-boleto-a-vista-com-10-de-desconto/", "#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(6) > div"),
    CURSO_ENA_8("Assinatura Premium 2 Anos - Boleto à vista com 10% de desconto", "https://www.estrategiaconcursos.com.br/curso/assinatura-premium-2-anos-boleto-a-vista-com-10-de-desconto/", "#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(8) > div");
    private String NomeCurso;
    private String LinkCurso;
    private String CssSelector;

    CursosEnum(String nomeCurso, String linkCurso, String cssSelector) {
        NomeCurso = nomeCurso;
        LinkCurso = linkCurso;
        CssSelector = cssSelector;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public String getLinkCurso() {
        return LinkCurso;
    }

    public void setLinkCurso(String linkCurso) {
        LinkCurso = linkCurso;
    }

    public String getCssSelector() {
        return CssSelector;
    }

    public void setCssSelector(String cssSelector) {
        CssSelector = cssSelector;
    }
}
