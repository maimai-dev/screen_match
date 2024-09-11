import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme chefao = new Filme();
        chefao.setNome("O poderoso chefão");
        chefao.setAnoLancamento(1970);
        chefao.setDuracaoEmMinutos(180);
        chefao.setIncluidoNoPlano(true);

        chefao.exibeFichaTecnica();
        chefao.avalia(8);
        chefao.avalia(5);
        chefao.avalia(10);
        System.out.println("Total de avaliações: " + chefao.getTotalDeAvaliacoes());
        System.out.println("Media de avaliações: " + chefao.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2010);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);

    }
}
