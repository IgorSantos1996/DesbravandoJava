public class RegistroVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("TDD");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("TDD");
        ebook.setValor(29.90);

        CarrinhodeCompras carrinho = new CarrinhodeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        System.out.println("Total" + carrinho.getTotal());
        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é " + fisico.getValor());
        }

    }
}