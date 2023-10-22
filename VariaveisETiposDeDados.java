public class VariaveisETiposDeDados {
    
    public static void main(String[] args) {

        //8 bits - Min.: -128 / Max.: 127
        byte meuByte = 127;
        System.out.println(System.lineSeparator() + "Meu Byte: " + meuByte + System.lineSeparator());

        //16 bits - Min.: -32768 / Max.: 32767
        short meuShort = 32767;
        System.out.println("Meu Short: " + meuShort + System.lineSeparator());

        //32 bits - Min.: -2147483648 / Max.: 2147483647
        int meuInt = 2147483647;
        System.out.println("Meu Int: " + meuInt + System.lineSeparator());

        //64 bits
        long meuLong = 10L;
        System.out.println("Meu Long: " + meuLong + System.lineSeparator());

        //64 bits - Dupla precisão
        double meuDouble = 102.51;
        System.out.println("Meu Double: " + meuDouble + System.lineSeparator());

        //32 bits - Precisão simples
        float meuFloat = 102.51F;
        System.out.println("Meu Float: " + meuFloat + System.lineSeparator());

        //16 bits - 1 unicode
        char meuChar = 'A';
        System.out.println("Meu Char: " + meuChar + System.lineSeparator());

        //1 bit
        boolean meuBoolean = true;
        System.out.println("Meu Boolean: " + meuBoolean + System.lineSeparator());

    }
}

