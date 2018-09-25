public class CadastroLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome  ("Igor");
        autor.setEmail ("igsantos1996@gmail.com");
        autor.setCpf  ("123.122.121.32");

        Livro l = new LivroFisico(autor);
        l.setNome ("Java  prático");
        l.setDescricao ("Novos recursos da liguagem");
        l.setValor (59.90);
        l.setIsbn ("982-212-2121-21-21");
        l.setAutor(autor);

        l.showDetails01();

        Autor outroAutor = new Autor();
        outroAutor.setNome ("José");
        outroAutor.setEmail  ("igor@fd@.ds");
        outroAutor.setCpf ("9832.2312.213");

        Livro l1 = new Livro(outroAutor);
        l1.setNome ("Lógica de programação");
        l1.setDescricao ("Crie seus primeiro programas");
        l1.setValor  (59.90);
        l1.setIsbn ("343-232-12131-32-23");
        l1.setAutor(outroAutor);

        l1.showDetails01();
        if (autor == outroAutor) {
            System.out.println("Iguais, mesmo autor!");
        } else {
            System.out.println("Pq são diferentes?");
        }

    }
}