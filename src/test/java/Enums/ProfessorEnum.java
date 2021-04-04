package Enums;

public enum ProfessorEnum {
    ENA_LOIOLA("Ena Loiola", "https://www.estrategiaconcursos.com.br/cursosPorProfessor/ena-loiola-800/");

    private String NomeProfessor;
    private String LinkPorProfessor;

    ProfessorEnum(String nomeProfessor, String linkPorProfessor) {
        NomeProfessor = nomeProfessor;
        LinkPorProfessor = linkPorProfessor;
    }

    public String getNomeProfessor() {
        return NomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        NomeProfessor = nomeProfessor;
    }

    public String getLinkPorProfessor() {
        return LinkPorProfessor;
    }

    public void setLinkPorProfessor(String linkPorProfessor) {
        LinkPorProfessor = linkPorProfessor;
    }
}
