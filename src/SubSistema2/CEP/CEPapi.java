package SubSistema2.CEP;

import Dio.Padrao.Java.Gof.Singleton.Sigleton2;

public class CEPapi {

    private static CEPapi instancia = new CEPapi();

    private CEPapi(){
        super();
    }

    public static CEPapi getInstance(){

        return instancia;
}
    public String recuperarCidade(String CEP){
        return "Sorocaba";

    }
    public String recuperarEstado(String CEP){
        return "SP";

    }

}
