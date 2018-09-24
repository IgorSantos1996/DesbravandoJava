public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double livroJava8 = 59.90;
        double livroTDD = 38.11;
        double soma = livroJava8 + livroTDD;
        System.out.println("O total em estoque é  " + soma);
        int numero = 4;
        int outronumeroigual = numero;
        numero += 5;
        double v2 = 0, v1 = 0, valor = v1 > v2 ? 100 : 0;
        double some = 0;
        int contador = 0;
        while (contador < 35) {
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador++;
        }
        System.out.println(soma);
        /*
         * System.out.println(numero); System.out.println(outronumeroigual);
         * System.out.println("Eu sou uma String"); String texto = "Eu sou uma String";
         * System.out.println(texto);
         */
        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto");

        } else {
            System.out.println("Seu estoque está bom");
        }
        for (int i = 0; i < 35; i++) {
            soma += 59.90;
        }
        System.out.println(soma);
        for (int k = 0; k <= 10; k++) {
            if (k == 7) {
                continue;
            }
            System.out.println(k);
        }
        for (int p = 0; p <= 10; p++) {
            if(p == 7)
                break;
        }
        System.out.println(p);

    }
}