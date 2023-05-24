import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        double pesoMaximo = 50.0;
        double pesoMulta = 4.0;

        Scanner entrada_do_usuario = new Scanner(System.in);

        System.out.println("Digite o peso do peixe");
        double pesoPeixe = entrada_do_usuario.nextDouble();
        double pesoExedente = pesoPeixe - pesoMaximo;
        System.out.println("O peso excedente do peixe é: " + pesoExedente);
        double calculoMulta = pesoExedente * pesoMulta;
        System.out.println("Multa a ser paga: " + calculoMulta);















    }
}
