public class Principal {
    public static void main(String[] args) {
        Filme chefao = new Filme();
        chefao.nome = "O poderoso chefão";
        chefao.anoLancamento = 1970;
        chefao.duracaoEmMinutos = 180;

        chefao.exibeFichaTecnica();
        chefao.avalia(8);
        chefao.avalia(5);
        chefao.avalia(10);
        System.out.println(chefao.somaDasAvaliacoes);
        System.out.println(chefao.totalDeAvaliacoes);
        System.out.println(chefao.pegaMedia());
    }
}
