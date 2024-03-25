public class Diretor {

    private String nome;
    private String enderecoGravacao;
    private int tempoFilmagem;
    private String dataInicio;
    private String dataFim;
    public Diretor(String nome, String enderecoGravacao, int tempoFilmagem, String dataInicio, String dataFim){
        this.nome = nome;
        this.enderecoGravacao = enderecoGravacao;
        this.tempoFilmagem = tempoFilmagem;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEnderecoGravacao() {
        return enderecoGravacao;
    }

    public void setEnderecoGravacao(String enderecoGravacao) {
        this.enderecoGravacao = enderecoGravacao;
    }

    public int getTempoFilmagem() {
        return tempoFilmagem;
    }

    public void setTempoFilmagem(int tempoFilmagem) {
        this.tempoFilmagem = tempoFilmagem;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}