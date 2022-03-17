import java.util.Scanner;
public class ExemploWhile{
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int contador;
        contador = 1;
        while (contador <=3) {
            System.out.println("Digite a primeira nota");
            double nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota");
            double nota2 = leitor.nextDouble();
            double media = (nota1 + nota2) / 2;
            System.out.printf("Aqui está sua média: %.2f\n", media);
            contador++;
        }
        
        leitor.close();    
    }
}