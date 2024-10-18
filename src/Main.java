public class Main {
    public static void main(String[] args) {

        int nota1 = 5;
        int nota2 = 5;
        int nota3 = 5;
        int nota4 = 5;

        int notaFinal = nota1 + nota2 + nota3 + nota4;
        double media = notaFinal / 4;

        if (media>= 7){
            System.out.println("parabens voce foi aprovado!!!");
        }
        else if (media>=5) {
            System.out.println("Vocé está de recuperação, Se esforce mais ano que vem" );
        }
        else {
            System.out.println("por pouco desenpenho voce reprovou de ano");
        }
    }
}