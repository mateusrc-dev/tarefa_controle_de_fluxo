import java.util.Scanner;
import java.text.DecimalFormat;

public class ResultadoDasNotas {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        
        System.out.println("Por favor, digite a primeira nota:");
        Float nota1 = s.nextFloat();
        
        System.out.println("Por favor, digite a segunda nota:");
        Float nota2 = s.nextFloat();
        
        System.out.println("Por favor, digite a terceira nota:");
        Float nota3 = s.nextFloat();
        
        System.out.println("Por favor, digite a quarta nota:");
        Float nota4 = s.nextFloat();
        
        Float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media >= 7) {
        	System.out.println("Parabéns, sua media é igual a " + decimalFormat.format(media) + " e você está aprovado!!");
        } else if (media >= 5 && media < 7) {
        	System.out.println("Sua media é igual a " + decimalFormat.format(media) + " e você está de recuperação!!");
        } else {
        	System.out.println("Sua media é igual a " + decimalFormat.format(media) + " e você está reprovado!!");
        }
        
        s.close();
	}
}
