package Dio.Padrao.Java.Gof.Singleton;

public class Sigleton2 {
    private static Sigleton2 instancia = new Sigleton2();

    private Sigleton2(){
   super();
    }

    public static Sigleton2 getInstance(){

        return instancia;
    }


}

