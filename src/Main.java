//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme = Cadastro.cadastrarFilme();

        System.out.println("\nInformações cadastradas do filme");
        System.out.println("Filme:");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor:");
        System.out.println("Nome: " + filme.getDiretor().getNome());
        System.out.println("Endereço de Gravação: " + filme.getDiretor().getEnderecoGravacao());
        System.out.println("Tempo de Filmagem: " + filme.getDiretor().getTempoFilmagem());
        System.out.println("Data de Início: " + filme.getDiretor().getDataInicio());
        System.out.println("Data de Fim: " + filme.getDiretor().getDataFim());
        System.out.println("Lista de Atores:");
        for (Atores ator : filme.getListaAtores()) {
            System.out.println(ator.getBytes());
        }
    }
}