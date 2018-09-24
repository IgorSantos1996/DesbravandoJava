public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;
 
    
    public Livro (){}

    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }


    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;

    }

    

    

    void showDetails01() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.showDetails01();
        System.out.println("--");

        if (this.temAutor()) {
            autor.showDetails01();
        }
        System.out.println();

    }

    public boolean aplicaDesconto(double porcetagem) {
        if (porcetagem > 0.3){
            return false;
        }else if(!this.impresso && porcetagem > 0.15){
            return false;
        }
        this.valor -= this.valor * porcetagem;
        return true;
    }

    void adicionaValor(double valor) {
        this.valor = valor;
    }

    double retornaValor() {
        return this.valor;
    }

    public boolean temAutor() {
        boolean naoEhNull = this.autor != null;
        return naoEhNull;
    }

}
