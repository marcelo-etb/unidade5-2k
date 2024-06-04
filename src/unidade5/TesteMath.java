package unidade5;

public class TesteMath {
    public static void main(String[] args) {
        int numero = 25;
        // Métodos estáticos - Não precisam do Objeto
        System.out.println(Math.pow(numero, 2));
        System.out.println(Math.sqrt(numero));
        // Atributos estáticos - não precisam do Objeto
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.TAU);
    }
}
