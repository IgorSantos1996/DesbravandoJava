@FunctionalInterface
public interface Promocional {
    boolean aplicaDesconto (double porcentagem);
    //boolean naoSouMaisUmaInterfaceFuncional();
    //interface funcional só pode ter um método

    default boolean aplicaDescontoDe10Porcento(){
        return aplicaDesconto(0.1);
    }
    
}