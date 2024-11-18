import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Vendas {

    static String[] hora_todos=new String[100];
    static String[] hora1=new String[100];
    static String[] hora2=new String[100];
    static String[] hora3=new String[100];

    static int auxiliar=0;
    static int auxiliar1=0;
    static int auxiliar2=0;
    static int auxiliar3=0;

    static int[][] GuardarPrimeiro = new int[50][30];
    static int[][] GuardarSegundo = new int[20][30];
    static int[][] GuardarTerceiro = new int[10][15];

    public static void Log(){
        for (int i=0; i<auxiliar;i++){
            System.out.println(hora_todos[i]);

        }

    }
    public static void Log1() {
        for (int i = 0; i < auxiliar1; i++) {
            System.out.println(hora1[i]);
        }
    }

    public static void Log2() {
        for (int i = 0; i < auxiliar2; i++) {
            System.out.println(hora2[i]);
        }
    }

    public static void Log3() {
        for (int i = 0; i < auxiliar3; i++) {
            System.out.println(hora3[i]);
        }
    }



    public static void Vendas(){
         Date dataHoraAtual = new Date();
         String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
         String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);


        int opcao=0;
        int compra=0;
        Scanner scanner= new Scanner(System.in);


        do {
            System.out.println("Bem vindo ao MENU de vendas");
            System.out.println("1- Selecione o primeiro   para comprar");
            System.out.println("2- Selecione o segundo   para comprar");
            System.out.println("3- Selecione o terceiro   para comprar");
            System.out.println("0- Voltar");

            opcao = scanner.nextInt();


             if (opcao==1) {
                System.out.println("PRIMEIRO ANDAR");
                System.out.println("---------------------------------------------");
                Andares.MostrarPrimeiro();
                System.out.println("---------------------------------------------");
                System.out.println("Selecione uma cadeira para comprar");
                compra = scanner.nextInt();

                 boolean cadeiraEncontrada = false;

                 for (int i = 0; i < Andares.PrimeiroAndar.length; i++) {
                     for (int j = 0; j < Andares.PrimeiroAndar[i].length; j++) {

                         if (Andares.PrimeiroAndar[i][j] == compra) {

                             cadeiraEncontrada = true;

                             if (Andares.PrimeiroAndar[i][j] == 0) {
                                 System.out.println("Erro, a cadeira 0 não existe.");
                             } else {
                                 Andares.PrimeiroAndar[i][j] = 0;
                                 GuardarPrimeiro[i][j]=compra;
                                 hora1[auxiliar1]=("A cadeira Numero "+compra+ " No primeiro andar Foi vendida na data "+ data +" no horário "+hora);
                                 auxiliar1++;
                                 hora_todos[auxiliar]=("A cadeira Numero "+compra+ " No primeiro andar Foi vendida na data "+ data +" no horário "+hora);
                                 auxiliar++;
                                 System.out.println("Cadeira  "+compra+" comprada com sucesso!");
                             }
                             break;
                         }
                     }
                     if (cadeiraEncontrada) break;
                 }

                 if (!cadeiraEncontrada) {
                     System.out.println("Erro: Cadeira " + compra + " não está disponível.");
                    }



                }

            if (opcao==2) {
                System.out.println("SEGUNDO ANDAR");
                System.out.println("---------------------------------------------");
                Andares.MostrarSegundo();
                System.out.println("---------------------------------------------");
                System.out.println("Selecione uma cadeira para comprar");
                compra = scanner.nextInt();

                boolean cadeiraEncontrada = false;

                for (int i = 0; i < Andares.SegundoAndar.length; i++) {
                    for (int j = 0; j < Andares.SegundoAndar[i].length; j++) {

                        if (Andares.SegundoAndar[i][j] == compra) {

                            cadeiraEncontrada = true;

                            if (Andares.SegundoAndar[i][j] == 0) {
                                System.out.println("Erro, a cadeira 0 não existe.");
                            } else {
                                Andares.SegundoAndar[i][j] = 0;
                                GuardarSegundo[i][j]=compra;
                                hora2[auxiliar2]=("A cadeira Numero "+compra+ " No Segundo andar Foi vendida na data "+ data +" no horário "+hora);
                                auxiliar2++;
                                hora_todos[auxiliar]=("A cadeira Numero "+compra+ " No segundo andar Foi vendida na data "+data+" no horário "+hora);
                                auxiliar++;
                                System.out.println("Cadeira " + compra + " comprada com sucesso!");
                            }
                            break;
                        }
                    }


                    if (cadeiraEncontrada) break;
                }

                if (!cadeiraEncontrada) {
                    System.out.println("Erro: Cadeira " + compra + " não está disponível.");
                }

            }






            if (opcao==3) {
                System.out.println("TERCEIRO ANDAR");
                System.out.println("---------------------------------------------");
                Andares.MostrarTerceiro();
                System.out.println("---------------------------------------------");
                System.out.println("Selecione uma cadeira para comprar");
                compra = scanner.nextInt();

                boolean cadeiraEncontrada = false;

                for (int i = 0; i < Andares.TerceiroAndar.length; i++) {
                    for (int j = 0; j < Andares.TerceiroAndar[i].length; j++) {

                        if (Andares.TerceiroAndar[i][j] == compra) {

                            cadeiraEncontrada = true;

                            if (Andares.TerceiroAndar[i][j] == 0) {
                                System.out.println("Erro, a cadeira 0 não existe.");
                            } else {
                                Andares.TerceiroAndar[i][j] = 0;
                                GuardarTerceiro[i][j]=compra;
                                hora3[auxiliar3]=("A cadeira Numero "+compra+ " No Terceiro andar Foi vendida na data "+ data +" no horário "+hora);
                                auxiliar3++;
                                hora_todos[auxiliar]=("A cadeira Numero "+compra+ " No terceiro andar Foi vendida na data "+data+" no horário "+hora);
                                auxiliar++;
                                System.out.println("Cadeira " + compra + " comprada com sucesso!");
                            }
                            break;
                        }
                    }
                    if (cadeiraEncontrada) break;
                }

                if (!cadeiraEncontrada) {
                    System.out.println("Erro: Cadeira " + compra + " não está disponível.");
                }

            }

        }while(opcao!=0);

    }
}