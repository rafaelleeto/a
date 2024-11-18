import java.util.Scanner;

public class Menu {
    public static void Menu(){

        Scanner scanner=new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu do teatro");
            System.out.println("1- Menu de vendas de ingressos");
            System.out.println("2- Desistencia da compra");
            System.out.println("3- Mostrar os andares do teatro");
            System.out.println("4- Lista de logs");
            System.out.println("0- Sair do Programa");
            opcao = scanner.nextInt();


            if (opcao==1){
                Vendas.Vendas();
            }

            else if(opcao==2){
                Desistencia.Desistencia();
            }

            else if (opcao==3) {
                Andares.Andares();
            }

            else if(opcao==4){
                Log.Log();
            }


        } while (opcao!=0);
    }
}
