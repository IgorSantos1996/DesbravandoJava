public class Contato{

    String nome;
    String email;
    double celular;

    public Contato() {}
    public Contato (String nome, String email, double celular){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }


    public String toString(){
        return nome + ":" + email;
    }

}