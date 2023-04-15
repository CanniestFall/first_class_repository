import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);   
    
        System.out.println("Digite sua nota; ");

        double nota = Double.parseDouble(In.nextLine());

        if (nota <= 40.0){ 
            System.out.println("Reprovado");
        } else if (nota > 40 && nota < 70) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    } 
}
