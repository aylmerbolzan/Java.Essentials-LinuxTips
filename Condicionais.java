public class Condicionais {
    public static void main (String[] args) {

        // EL e ELSEs
        long valor1 = 1L;
        long valor2 = 123L;

        if (valor1 == valor2) {
            System.out.println("São iguais.");
        } else if (valor1 < valor2) {
            System.out.println("São diferentes.");
        } else {
            System.out.println("Valores diferentes");
        };


        // Switch Case
        String nomeDoMes = "fevereiro";

        switch (nomeDoMes){

            case "1":
                  System.out.println("Janeiro");
                  break;
            case "2":
                  System.out.println("Fevereiro");
            case "3":
                  System.out.println("Março");
                  break;
            case "4":
                  System.out.println("Abril");
                  break;
            case "5":
                  System.out.println("Maio");
            case "6":
                  System.out.println("Junho");
                  break;
            case "7":
                  System.out.println("Julho");
                  break;
            case "8":
                  System.out.println("Agosto");
            case "9":
                  System.out.println("Setembro");
                  break;
            case "10":
                  System.out.println("Outubro");
                  break;
            case "11":
                  System.out.println("Novembro");
            
            case "12":
                  System.out.println("Dezembro");
                  break;
        }
    }
}