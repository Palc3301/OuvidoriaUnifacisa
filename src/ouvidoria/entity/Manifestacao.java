package ouvidoria.entity;

import ouvidoria.enumOuvidoria.SituacaoManifestacao;
import ouvidoria.enumOuvidoria.TipoManifestacao;

public class Manifestacao {

    private static int COUNT_MANIFESTACAO = 0;
    private int codigo;
    private String titulo;
    private String descricao;
    private String autor;
    private SituacaoManifestacao situacao;
    private TipoManifestacao tipo;

    public Manifestacao(String titulo, String autor, TipoManifestacao tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.situacao = SituacaoManifestacao.ABERTA;
        this.codigo = ++COUNT_MANIFESTACAO;
        this.tipo = tipo;
    }

    public Manifestacao(String titulo, String descricao, String autor, TipoManifestacao tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.situacao = SituacaoManifestacao.ABERTA;
        this.codigo = ++COUNT_MANIFESTACAO;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public SituacaoManifestacao getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoManifestacao situacao) {
        this.situacao = situacao;
    }

    public TipoManifestacao getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Manifestacao{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
