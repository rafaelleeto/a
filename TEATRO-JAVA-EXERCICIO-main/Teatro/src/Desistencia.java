import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Desistencia {
    public static int auxiliar=0;
    static String[] desistir=new String[100];




    public static void LogDesistencia(){
        for (int i = 0; i < auxiliar; i++) {
            System.out.println(desistir[i]);

        }
    }

    public static void Desistencia() {
        int opcao = 0;
        int cadeira = 0;
        Scanner scanner = new Scanner(System.in);
        Date dataHoraAtual = new Date();
        String data_desistencia = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora_desistencia = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);



        do {

            System.out.println("Selecione o ANDAR que você deseja reembolsar");
            System.out.println("-------------------------------------------");
            Andares.MostrarPrimeiro();
            System.out.println("-------------------------------------------");
            Andares.MostrarSegundo();
            System.out.println("-------------------------------------------");
            Andares.MostrarTerceiro();
            System.out.println("-------------------------------------------");
            System.out.println("1- Primeiro andar");
            System.out.println("2- Segundo andar");
            System.out.println("3- Terceiro andar");
            System.out.println("0- Voltar");

            opcao = scanner.nextInt();


            if (opcao == 1) {
                int contador=0;

                System.out.println("Selecione a cadeira que você deseja reembolsar");
                Vendas.Log1();
                cadeira = scanner.nextInt();
                for (int i = 0; i < Andares.PrimeiroAndar.length; i++) {
                    for (int j = 0; j < Andares.PrimeiroAndar[i].length; j++) {
                        contador++;
                        if (contador==cadeira){
                            Andares.PrimeiroAndar[i][j]=cadeira;
                            desistir[auxiliar]="a cadeira numero "+cadeira +" do andar um foi reembolsada no dia "+data_desistencia+ "no horario "+hora_desistencia;
                            auxiliar++;
                        }

                    }

                }

            }

            if (opcao == 2) {
                int contador=0;

                System.out.println("Selecione a cadeira que você deseja reembolsar");
                Vendas.Log2();
                cadeira = scanner.nextInt();
                for (int i = 0; i < Andares.SegundoAndar.length; i++) {
                    for (int j = 0; j < Andares.SegundoAndar[i].length; j++) {
                        contador++;
                        if (contador==cadeira){
                            Andares.SegundoAndar[i][j]=cadeira;
                            desistir[auxiliar]="a cadeira numero "+cadeira +" do andar dois foi reembolsada no dia "+data_desistencia+ "no horario "+hora_desistencia;
                            auxiliar++;
                        }

                    }

                }

            }



            if (opcao == 3) {
                int contador=0;

                System.out.println("Selecione a cadeira que você deseja reembolsar");
                Vendas.Log3();
                cadeira = scanner.nextInt();
                for (int i = 0; i < Andares.TerceiroAndar.length; i++) {
                    for (int j = 0; j < Andares.TerceiroAndar[i].length; j++) {
                        contador++;
                        if (contador==cadeira){
                            Andares.TerceiroAndar[i][j]=cadeira;
                            desistir[auxiliar]="a cadeira numero "+cadeira +" do andar tres foi reembolsada no dia "+data_desistencia+ "no horario "+hora_desistencia;
                            auxiliar++;
                        }

                    }

                }

            }




        } while (opcao != 0);
    }
}