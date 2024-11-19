import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Desistencia {
    public static int auxiliar = 0;
    static String[] desistir = new String[100];
    static Date dataHoraAtual = new Date();
    static String data_desistencia = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    static String hora_desistencia = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);


    public static void LogDesistencia() {
        for (int i = 0; i < auxiliar; i++) {
            System.out.println(desistir[i]);

        }
    }

    public static void Desistencia() {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("1- Primeiro andar");
            System.out.println("2- Segundo andar");
            System.out.println("3- Terceiro andar");
            System.out.println("0- Voltar");
            opcao = scanner.nextInt();


            if (opcao == 1) {
                Desistir(opcao);
            } else if (opcao == 2) {
                Desistir(opcao);

            } else if (opcao == 3) {
                Desistir(opcao);

            } else {
                System.out.println("erro");
                return;
            }


        } while (opcao != 0);
    }

    public static void Desistir(int reembolso) {
        int andarusuario[][];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int cadeira;

        if (reembolso == 1) {
            andarusuario = Andares.PrimeiroAndar;
        } else if (reembolso == 2) {
            andarusuario = Andares.SegundoAndar;
        } else if (reembolso == 3) {
            andarusuario = Andares.TerceiroAndar;
        } else {
            System.out.println("Erro");
            return;
        }

        System.out.println("Selecione a cadeira que você deseja reembolsar");

        cadeira = scanner.nextInt();
        for (int i = 0; i < andarusuario.length; i++) {
            for (int j = 0; j < andarusuario[i].length; j++) {
                contador++;
                if (contador == cadeira) {
                    andarusuario[i][j] = cadeira;
                    desistir[auxiliar] = "a cadeira numero " + cadeira + " do andar " + reembolso + " foi reembolsada no dia " + data_desistencia + "no horario " + hora_desistencia;
                    auxiliar++;
                }

            }

        }

    }
}