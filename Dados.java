import java.util.ArrayList;

public class Dados{

    ArrayList<Contato> c = new ArrayList();
    
    public void cadastrarContato(Contato contato){
        c.add(contato);
    }
    public int numerodeContatos(){
        return c.size();
        
    }

}