public class CarrinhodeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        // produto.aplicaDesconto(0.16);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

   for (int i = 0 ; i <= produtos.length; i++){
       try{
           Produto produto = produtos[i];
           if(produto != null){
               System.out.println(produto.getValor());
           }
       } catch(ArrayIndexOutOfBoundsException e ){
        System.out.println("Deu exception no indice: " + i);
        e.printStackTrace();
       }
   }
     public double getTotal() {
        return total;
    } 

}
