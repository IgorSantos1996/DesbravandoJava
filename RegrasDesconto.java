public class RegrasDesconto {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setValor = (89.99);
        System.out.println("Valor atual: " + l.getValor());

        if(!l.aplicaDesconto(0.4)){
            System.out.println("Desonto não pode ser maior que 30%");
        }else{
            System.out.println("Valor com desconto: " + l.getValor());
        }
    }
}