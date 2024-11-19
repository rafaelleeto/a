public class Log {
    public static void Log() {
        Log.Registro();
        Desistencia.LogDesistencia();
    }

        public static void Registro () {
            for (int i = 0; i < Vendas.auxiliar; i++) {
                System.out.println(Vendas.hora_todos[i]);

            }

        }

    }
