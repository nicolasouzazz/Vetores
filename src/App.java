import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vetores");
        System.out.println("===========================");

        /*
         * Criando e inicializando o vetor
         * int vetor[] = { 3, 4, 5, 8, 2 };
         * for (int contador = 0; contador < vetor.length; contador++) {
         * System.out.println("Elemento na posição " + contador + ": " +
         * vetor[contador]);
         * }
         */

        /*
         * EX1-Exemplo vetor
         * String mes[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
         * "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
         * int dia[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
         * for (int contador = 0; contador < mes.length; contador++) {
         * System.out.println("O mês de " + mes[contador] + " tem " + dia[contador] +
         * " dias.");
         * System.out.println("============================");
         * 
         * }
         */
        /*
         * Exemplo foreach (Para cada) ,(utilizado para percorrer vetores e coleções),
         * exemplo de ordenar vetores por ordem crescente
         * int num[] = { 3, 5, 1, 8, 4 };
         * Arrays.sort(num); // Ordena o vetor em ordem crescente
         * 
         * 
         * for (int valor : num) {
         * System.out.println("Valor: " + valor);
         * System.out.println("=========================");
         * }
         */

        /*
         * Exemplo de busca binaria (não existe indice negativo, caso procure por um
         * valor que não existe no vetor ele retorna negativo)
         * 
         * int vetor[] = { 8, 9, 1, 4, 3, 5 };
         * for (int valor : vetor) {
         * System.out.print(valor + " ");
         * }
         * System.out.println("");
         * int posicao = Arrays.binarySearch(vetor, 1); // Procura o valor 1 no vetor
         * System.out.println("Valor encontrado na posição " + posicao);
         * System.out.println("=========================");
         */

        /* Exemplo de preenchimento de vetor */
        int vetor[] = new int[20]; // Cria um vetor de tamanho 20
        Arrays.fill(vetor, 7); // Preenche todo o vetor com o valor 7
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
