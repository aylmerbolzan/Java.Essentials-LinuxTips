import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {

            // Array - Estrutura de dados simples para armazenar uma coleção de elementos

        // Forma mais comum de declarar
        int[] arrayDeInt;

        // Forma menos comum de declarar
        int arrayDeInt2[];

        // Inicianto um array com tamanho definido
        int[] arrayDeInt3 = new int[20];

        // Preenchendo o array
        Integer[] arrayDeInt4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Descobrindo o tamanho do array
        int arraySize = arrayDeInt4.length;
        System.out.println("O tamanho do array é " + arraySize);

        // Percorrendo o array
        List<Integer> itens = Arrays.asList(arrayDeInt4);
        itens.forEach(System.out::println);

        // Copiando um array
        String[] treinamento = new String[] {
            "Treinamento",
            "Descomplicando",
            "Java",
            "e",
            "Spring",
            "da",
            "Linux",
            "Tips"
        };

        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 5);
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        treinamentoNomeList.forEach(System.out::println);

        String[] arrayCom2 = Arrays.copyOf(treinamentoNome, 2);
        List<String> arrayCom2List = List.of(arrayCom2);
        arrayCom2List.forEach(System.out::println);


        // Preenchendo um array - fill
        String[] java = new String[10];
        Arrays.fill(java, "java");
        List<String> javaList = List.of(java);
        javaList.forEach(System.out::println);


        // Comparando arrays
        int[] arrayDeInt5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayDeInt6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        System.out.println("Os arrays são iguais?" + Arrays.equals(arrayDeInt5, arrayDeInt6));


        // Sorted - organizando em ordem alfabética
        String[] sorted = Arrays.copyOf(treinamento, 4);
        Arrays.sort(sorted);
        List<String> sortedList = List.of(sorted);
        sortedList.forEach(System.out::println);
    }
}
