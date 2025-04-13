public class Documento {
    private String titulo;
    private String conteudo;
    private String formato;

    public Documento(String titulo, String conteudo, String formato) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.formato = formato;
    }

    public Documento(Documento outro) {
        this.titulo = outro.titulo;
        this.conteudo = outro.conteudo;
        this.formato = outro.formato;
    }

    public Documento clone() {
        return new Documento(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}
