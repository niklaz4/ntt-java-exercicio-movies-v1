import java.util.ArrayList;
import java.util.List;
public class Filme {

    private String titulo;
    private int duracao;
    private List<Atores> listaAtores;
    private Diretor diretor;

    public Filme(String titulo, Diretor diretor){
        this.titulo = titulo;
        this.diretor = diretor;
        this.listaAtores = new ArrayList<Atores>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Atores> getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(List<Atores> listaAtores) {
        this.listaAtores = listaAtores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
}
