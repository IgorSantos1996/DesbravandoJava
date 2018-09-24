public class RegrasDesconto {
    public static void main(String[] args) {
        Autor autor  = new Autor();
        autor.setNome("Igor");
        Livro l = new Livro(autor);
        l.setValor(89.99);
        System.out.println("Valor atual: " + l.getValor());

        if(!l.aplicaDesconto(0.3)){
            System.out.println("Desonto no livro não pode ser maior que 30%");
        }else{
            System.out.println("Valor com desconto: " + l.getValor());
        }
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
    }
}