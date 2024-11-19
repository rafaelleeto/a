import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vendas {
    static Date dataHoraAtual = new Date();
    static String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    static String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);


    static String[] hora_todos = new String[100];

    static int auxiliar = 0;

    public static void venda_andares(int andar) {

        int andarusuario[][];
        int compra;
        Scanner scanner = new Scanner(System.in);
        compra = scanner.nextInt();

        boolean cadeiraEncontrada = false;

        if (andar == 1) {
            andarusuario = Andares.PrimeiroAndar;
        } else if (andar == 2) {
            andarusuario = Andares.SegundoAndar;
        } else if (andar == 3) {
            andarusuario = Andares.TerceiroAndar;
        } else {
            System.out.println("Andar inválido");
            hora_todos[auxiliar] = ("A cadeira Numero " + compra + " no andar "+ andar+" Foi vendida na data " + data + " no horário " + hora);
            auxiliar++;
            return;
        }


        for (int i = 0; i < andarusuario.length; i++) {            // Laço de repetição para Percorrer o primeiro andar
            for (int j = 0; j < andarusuario[i].length; j++) {

                if (andarusuario[i][j] == compra) {

                    cadeiraEncontrada = true;

                    if (compra>andarusuario[i][j]) {
                        System.out.println("Essa cadeira não existe, tente novamente");
                        Vendas.hora_todos[Vendas.auxiliar] = ("ERR0005 " + Vendas.data + " no horário " + Vendas.hora);

                    } else {
                        andarusuario[i][j] = 0; // Seta a cadeira como zero, indicando que ela está ocupada
                        hora_todos[auxiliar] = ("A cadeira Numero " + compra + " no andar "+ andar+" Foi vendida na data " + data + " no horário " + hora);
                        auxiliar++;
                        System.out.println("Cadeira  " + compra + " comprada com sucesso!");
                    }
                    break;
                }
            }
            if (cadeiraEncontrada) break;
        }

        if (!cadeiraEncontrada) {
            System.out.println("Erro: Cadeira " + compra + " não está disponível.");
            Vendas.hora_todos[Vendas.auxiliar] = ("ERR0015 " + Vendas.data + " no horário " + Vendas.hora);
        }

    }

    public static void Vendas() {

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bem vindo ao MENU de vendas");
            System.out.println("1- Selecione o primeiro   para comprar");
            System.out.println("2- Selecione o segundo   para comprar");
            System.out.println("3- Selecione o terceiro   para comprar");
            System.out.println("0- Voltar");

            opcao = scanner.nextInt();


            if (opcao == 1) {
                Andares.MostrarAndar(opcao);
                venda_andares(opcao);

            }

            else if (opcao == 2) {
                Andares.MostrarAndar(opcao);
                venda_andares(opcao);

            }

            else if (opcao == 3) {
                Andares.MostrarAndar(opcao);
                venda_andares(opcao);
                }
            else {
                System.out.println("Andar inválido");
                Vendas.hora_todos[Vendas.auxiliar] = ("ERR0035 " + Vendas.data + " no horário " + Vendas.hora);
                auxiliar++;
            }

        } while (opcao != 0);

    }
}



