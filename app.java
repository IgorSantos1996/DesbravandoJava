import java.util.ArrayList;
public class app {
    public static void main (String [] args){

        ArrayList<Contato> contatos = new ArrayList();

        Contato c = new Contato("Carlos", "carlos@12.bol", 12129988);
        Contato c1 = new Contato("Vitor", "vitor@12.bol", 12129988);
        Contato c2 = new Contato("Lucio", "lucio@12.bol", 12129988);
        Contato c3 = new Contato("Sergio", "sergio@12.bol", 12129988);
        Contato c4 = new Contato("Chris", "vanuza@xooxo", 123388);

        contatos.add(c);
        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        contatos.add(4, c4); // add c4 a posicao 4 do arrayList


        for (Contato co : contatos){
            System.out.println(co);
        }
        System.out.println("Total de itens da lista" + contatos.size()); // tamanho
        System.out.println(contatos.contains(c2)); // retorna true se contatos conter 'c2'
        contatos.remove(c1); // remove c2 do arraylist
    }

}