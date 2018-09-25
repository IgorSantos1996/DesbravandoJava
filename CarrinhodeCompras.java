public class CarrinhodeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        //produto.aplicaDesconto(0.16);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }

}