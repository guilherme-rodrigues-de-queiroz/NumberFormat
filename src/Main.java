import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Formatando numero JAVA
        // Trazemos uma classe NumberFormat com o nome de valor com o seu metodo;
        NumberFormat valor = NumberFormat.getCurrencyInstance();
        String precoProduto = valor.format(1220.50);
        System.out.println(precoProduto);
    }
}