public class Ebook extends Livro implements Promocional {

    // private String descricao;
    // private double valor;
    // private String isbn;
    // private Autor autor;
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.16) {
            return false;

        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("Aplicando desconto no ebook");
        return true;
        // return super.aplicaDescontoDe(porcentagem);
    }
    @Override
    public String toString(){
        return "Eu sou um Ebook";
    }

    /*
     * public void setDescricao(String descricao) { this.descricao = descricao; }
     * 
     * public void setValor(double valor) { this.valor = valor;
     * 
     * }
     * 
     * public void setIsbn(String isbn) { this.isbn = isbn;
     * 
     * }
     * 
     * public void setAutor(Autor autor) { this.autor = autor; }
     * 
     * public String getDescricao() { return descricao; }
     * 
     * public Autor getAutor() { return autor; }
     * 
     * 
     * 
     * 
     * 
     * public double getValor() { return valor; }
     * 
     * public String getIsbn() { return isbn; }
     */
}