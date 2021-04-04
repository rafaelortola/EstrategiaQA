package features.report.enums;

public enum GherkinKeywordEnum {
    FUNCIONALIDADE("Funcionalidade: ");

    private String descricao;

    GherkinKeywordEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
