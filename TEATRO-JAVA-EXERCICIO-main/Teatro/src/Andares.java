public class Andares {

    static int contador=0;
    static int contador2=0;
    static int contador3=0;
    static int contador4=0;
    static int[][] PrimeiroAndar = new int[50][30];
    static int[][] SegundoAndar = new int[20][30];
    static int[][] TerceiroAndar = new int[10][15];



    public static void Andares() {
        contador4++;

            MostrarPrimeiro();
            MostrarSegundo();
            MostrarTerceiro();
        }


    public static void MostrarPrimeiro(){

        for (int i = 0; i < PrimeiroAndar.length; i++) {
            for (int j = 0; j < PrimeiroAndar[i].length ; j++) {

                System.out.print(PrimeiroAndar[i][j]);
                System.out.print("\t");
                if (PrimeiroAndar[i][j]<1000){
                    System.out.print("\t");
                }


            }
            System.out.print("\t");
            System.out.println("");

        }

    }

    public static void MostrarSegundo(){

        for (int i = 0; i < SegundoAndar.length; i++) {
            for (int j = 0; j < SegundoAndar[i].length ; j++) {

                System.out.print(SegundoAndar[i][j]);
                System.out.print("\t");
                if (contador<1000){
                    System.out.print("\t");
                }

            }
            System.out.print("\t");
            System.out.println("");

        }

    }

    public static void MostrarTerceiro(){

        for (int i = 0; i < TerceiroAndar.length; i++) {
            for (int j = 0; j < TerceiroAndar[i].length ; j++) {

                System.out.print(TerceiroAndar[i][j]);
                System.out.print("\t");
                if (contador<1000){
                    System.out.print("\t");
                }

            }
            System.out.print("\t");
            System.out.println("");

        }

    }

    public static void PrimeiroAndar(){

        for (int i = 0; i < PrimeiroAndar.length; i++) {
            for (int j = 0; j < PrimeiroAndar[i].length ; j++) {


                contador++;
                PrimeiroAndar[i][j]=contador;


            }

        }

    }

    public static void SegundoAndar(){

        for (int i = 0; i < SegundoAndar.length; i++) {
            for (int j = 0; j < SegundoAndar[i].length ; j++) {

                contador2++;
                SegundoAndar[i][j]=contador2;

            }

        }

    }

    public static void TerceiroAndar(){

        for (int i = 0; i < TerceiroAndar.length; i++) {
            for (int j = 0; j < TerceiroAndar[i].length ; j++) {

                contador3++;

                TerceiroAndar[i][j]=contador3;

            }

        }

    }


}
