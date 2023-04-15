import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        // SWITCH CASE
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o DDD desejado; ");

        String ddd = scanner.nextLine();   
    
        switch (ddd) {
            case "62":
            System.out.println("Goiás-Brazil");
            break;

            case "61":
            System.out.println("Brasília-Brazil");
            break;
           
            default: 
            System.out.println("DDD não disponível");
            break;
        }



    }


    
 }