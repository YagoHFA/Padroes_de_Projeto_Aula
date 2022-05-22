package Dio.Padrao.Java.Gof.Facade;

import SubSistema1.crm.CrmService;
import SubSistema2.CEP.CEPapi;

public class Facade {

    public void migrarCliente(String nome, String CEP){
       String cidade =  CEPapi.getInstance().recuperarCidade(CEP);
        String estado =  CEPapi.getInstance().recuperarEstado(CEP);
        CrmService.gravarCliente(nome, CEP, cidade, estado);
    }
}
