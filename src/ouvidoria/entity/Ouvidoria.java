package ouvidoria.entity;

import java.util.ArrayList;

public class Ouvidoria {
    private ArrayList<Manifestacao> manifestacoes = new ArrayList<Manifestacao>();

    public void registrarManifestacao(Manifestacao novaManifestacao) {
        manifestacoes.add(novaManifestacao);
    }

    public Manifestacao pesquisaPorCodigo(int codigo) throws ValorInvalidoException{
        if (codigo <= 0) {
            throw new ValorInvalidoException("O codigo" + codigo + "é invalido para a pesquisa");
        }
        Manifestacao manifestacaoPesquisada = null;

        for (Manifestacao item : manifestacoes ) {
            if(item.getCodigo() == codigo) {
                manifestacaoPesquisada = item;
                break;
            }
        }
        return manifestacaoPesquisada;
    }

    public ArrayList<Manifestacao> pesquisarPorAutor(String autor) throws ValorInvalidoException{
        if (autor == null) {
            throw new ValorInvalidoException("O autor deve ser informado!");
        }
        ArrayList<Manifestacao> intensEcontrados = new ArrayList<Manifestacao>();

        for(Manifestacao item : manifestacoes) {

            if(item != null && item.getAutor() != null &&item.getAutor().equalsIgnoreCase(autor)) {
                intensEcontrados.add(item);
            }
        }
        return intensEcontrados;
    }

    public void listarManifestacoes() {
        for(Manifestacao item : manifestacoes) {
            System.out.println(item); //chama o toString
        }
    }
}
