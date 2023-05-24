import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = entrada_do_usuario.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = entrada_do_usuario.nextDouble();
        double calculoIMC = peso / (altura * altura);
        System.out.println("Seu IMC é: " + calculoIMC);











    }
}
