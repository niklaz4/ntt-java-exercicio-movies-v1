import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    public static Filme cadastrarFilme(){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Digite as informações do filme ---");
        System.out.println("Título: ");
        String tituloFilme = sc.nextLine();

        System.out.println("Nome do diretor: ");
        String nomeDiretor = sc.nextLine();
        System.out.println("Endereco da gravaçao: ");
        String enderecoGravacao = sc.nextLine();
        System.out.println("Tempo de filmagem (em meses): ");
        int tempoFilmagem = sc.nextInt();
        System.out.println("Data de inicio (dd/MM/yyyy): ");
        String dataInicioStr = sc.next();
        System.out.println("Data final (dd/MM/yyyy): ");
        String dataFimStr = sc.next();

        String dataInicio = dataInicioStr;
        String dataFim = dataFimStr;

        Diretor diretor = new Diretor(nomeDiretor, enderecoGravacao, tempoFilmagem, dataInicio, dataFim);

        List<Atores> listaAtores = new ArrayList<>();
        System.out.println("Quantidade de atores: ");
        int qtdAtores = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdAtores; i++){
            System.out.println("Nome do ator ou atriz: " + (i + 1) + ": ");
            String nomeAtor = sc.nextLine();
            Atores ator = new Atores(nomeAtor);
            listaAtores.add(ator);
        }

        Filme filme = new Filme (tituloFilme, diretor);
        filme.setListaAtores(listaAtores);

        sc.close();
        return filme;
    }
}
