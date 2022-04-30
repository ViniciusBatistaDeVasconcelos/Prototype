package model;

public class Revista implements Cloneable{
    private Editora editora;
    private Edicao edicao;
    private String tipo;
    private String codigo;
    private String titulo;
    private String resumo;

    public Revista(Editora editora, Edicao edicao, String tipo, String codigo, String titulo, String resumo) {
        this.editora = editora;
        this.edicao = edicao;
        this.tipo = tipo;
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public Revista clone() throws CloneNotSupportedException {

        Revista revistaClone = (Revista) super.clone();
        revistaClone.editora = (Editora) revistaClone.editora.clone();
        revistaClone.edicao = (Edicao) revistaClone.edicao.clone();

        return revistaClone;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "editora=" + editora +
                ", edicao=" + edicao +
                ", tipo='" + tipo + '\'' +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", resumo='" + resumo + '\'' +
                '}';
    }
}
