import ouvidoria.entity.Manifestacao;
import ouvidoria.entity.Ouvidoria;
import ouvidoria.entity.ValorInvalidoException;
import ouvidoria.enumOuvidoria.TipoManifestacao;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Manifestacao novaMani1 = new Manifestacao("Mani1", "Pedro", TipoManifestacao.ELOGIO);
        Manifestacao novaMani2 = new Manifestacao("Mani2", "Abella", TipoManifestacao.SUGESTAO);
        Manifestacao novaMani3 = new Manifestacao("Mani3", "Marina", TipoManifestacao.RECLAMACAO);

        Ouvidoria ouvidoriaUniversidadeFacisa = new Ouvidoria();
        ouvidoriaUniversidadeFacisa.registrarManifestacao(novaMani1);
        ouvidoriaUniversidadeFacisa.registrarManifestacao(novaMani2);
        ouvidoriaUniversidadeFacisa.registrarManifestacao(novaMani3);

        ouvidoriaUniversidadeFacisa.listarManifestacoes();

        try {
            Manifestacao manifestacaoPesquisada = ouvidoriaUniversidadeFacisa.pesquisaPorCodigo(2);
            System.out.println(manifestacaoPesquisada);
        }
        catch (ValorInvalidoException e) {
            e.printStackTrace();
        }

        try {
            ArrayList<Manifestacao> maniPedro = ouvidoriaUniversidadeFacisa.pesquisarPorAutor("Pedro");

            for(Manifestacao manifestacaoP: maniPedro) {
                System.out.println(manifestacaoP);
            }
        } catch (ValorInvalidoException e) {
            e.printStackTrace();
        }
    }
}
