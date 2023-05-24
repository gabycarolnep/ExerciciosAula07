import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        double salarioMinimo = 1212.0;
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        double salarioUsuario = entrada_do_usuario.nextDouble();
        double calculoSalariosMinimos = salarioUsuario / salarioMinimo;
        System.out.println("Você recebe " + calculoSalariosMinimos + "salários mínimos: ");











    }
}
