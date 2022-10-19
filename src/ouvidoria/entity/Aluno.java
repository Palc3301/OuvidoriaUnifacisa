package ouvidoria.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String id;
    private String name;
    private String login;
    private String password;
    private List<Manifestacao> openManifestacoes;

    public Aluno() {
    }

    public Aluno(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public Aluno(String name, String login, String senha, String id) {
        this.name = name;
        this.login = login;
        this.password = senha;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Manifestacao> getManfistacoes() {
        return openManifestacoes;
    }

    public void addManifestacao(Manifestacao manifestacoes) {
        openManifestacoes.add(manifestacoes);
    }

    public String getId() {
        return id;
    }

    public boolean verificaAluno(String login, String senha) {
        if (this.name.equals(login) && this.password.equals(senha)) {

            return true;
        }
        return false;
    }

}
