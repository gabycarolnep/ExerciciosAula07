import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite sua idade em anos: ");
        double anos = entrada_do_usuario.nextDouble();
        System.out.println("Digite sua idade em meses: ");
        double mes = entrada_do_usuario.nextDouble();
        System.out.println("Digite sua idade em dias: ");
        double dia = entrada_do_usuario.nextDouble();
        double calculoIdadeDias = (anos * 365) + (mes * 30) + (dia);
        System.out.println("Sua idade em em dias é: " + calculoIdadeDias);













    }
}
