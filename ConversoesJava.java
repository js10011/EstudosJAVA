public class ConversoesJava {
    public static void main(String[] args) {

        // int → double
        int intNum = 10;
        double doubleNum = intNum;
        System.out.println("int → double: " + doubleNum);

        //  ouble → int
        double pi = 3.14;
        int piInt = (int) pi;
        System.out.println("double → int: " + piInt);

        // 3️⃣ long → int (cast obrigatório)
        long longNum = 1000L;
        int intFromLong = (int) longNum;
        System.out.println("long → int: " + intFromLong);

        // char → int (ASCII/Unicode)
        char letra = 'A';
        int ascii = letra;
        System.out.println("char → int: " + ascii);

        //  int → char
        int codigo = 66;
        char letra2 = (char) codigo;
        System.out.println("int → char: " + letra2);

        // 6️String - int
        String textoNumero = "123";
        int numero = Integer.parseInt(textoNumero);
        System.out.println("String → int: " + numero);

        //  String → double
        String textoDecimal = "9.5";
        double decimal = Double.parseDouble(textoDecimal);
        System.out.println("String → double: " + decimal);

        //  int → String
        int valor = 42;
        String valorTexto = String.valueOf(valor);
        System.out.println("int → String: " + valorTexto);

        
        Integer wrapper = valor; // autoboxing
        int primitivo = wrapper; // unboxing
        System.out.println("Wrapper → primitivo: " + primitivo);

        
    }
}
