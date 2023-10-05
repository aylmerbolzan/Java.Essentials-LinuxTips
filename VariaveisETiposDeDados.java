public class VariaveisETiposDeDados {
    
    public static void main(String[] args) {

        //8 bits - Min.: -128 / Max.: 127
        byte meuByte = 127;

        //16 bits - Min.: -32768 / Max.: 32767
        short meuShort = 32767;

        //32 bits - Min.: -2147483648 / Max.: 2147483647
        int meuInt = 2147483647;

        //64 bits
        long meuLong = 10L;

        //64 bits - Dupla precisão
        double meuDouble = 102.51;

        //32 bits - Precisão simples
        float meuFloat = 102.51F;

        //16 bits - 1 unicode
        char meuChar = 'A';

        //1 bit
        boolean meuBoolean = true;


        System.out.println("Meu Byte: " + meuByte);

        System.out.println("Meu Short: " + meuShort);

        System.out.println("Meu Int: " + meuInt);

        System.out.println("Meu Long: " + meuLong);

        System.out.println("Meu Double: " + meuDouble);

        System.out.println("Meu Float: " + meuFloat);

        System.out.println("Meu Char: " + meuChar);

        System.out.println("Meu Boolean: " + meuBoolean);

    }
}
