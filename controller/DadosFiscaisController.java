package controller;

import model.*;
import java.util.ArrayList;
public class DadosFiscaisController {

    public void clear() {}

    public ArrayList<DadosFiscaisModel> fakerDadosFiscais(ArrayList<DadosFiscaisModel> ListaDadosFiscais){

        int x = 10;
        for (int i = 1; i < x; i++){
            DadosFiscaisModel dadosFiscais = new DadosFiscaisModel();
            
            dadosFiscais.setNumero(i);
            dadosFiscais.setSerie(i);
            dadosFiscais.setChaveDeAcesso(11*i+i+i+i);
            dadosFiscais.setNaturezaDaOperação("VENDA MERC.ADQ.REC.TERC.");
            dadosFiscais.setProtocoloDeAutorizaçãoDeUso(15*i+(i + "/" + i + "/" + 20 + i)+(i +"h e "+ i + "min"));
            dadosFiscais.setSite(" www.nfe.fazenda.gov.br/portal ou site da Sefaz Autorizadora");                       

            ListaDadosFiscais.add(dadosFiscais);
        }
        return ListaDadosFiscais;
    }

}
