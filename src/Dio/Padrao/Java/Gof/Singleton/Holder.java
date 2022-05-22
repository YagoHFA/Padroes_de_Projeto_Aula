package Dio.Padrao.Java.Gof.Singleton;


    public class Holder {
        private static class HolderSingleton {

            private static Holder instancia = new Holder();
        }
        private Holder() {
            super();
        }

        public static Holder getInstance() {

            return HolderSingleton.instancia;
        }
    }

