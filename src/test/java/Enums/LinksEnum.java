package Enums;

public enum LinksEnum {

    PORPROFESSORES(1, "#b_professores > header > nav > div > div > div.nav-header-links > a:nth-child(3)");

    private Integer codigo;
    private String link;

    LinksEnum(Integer codigo, String link) {
        this.codigo = codigo;
        this.link = link;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
