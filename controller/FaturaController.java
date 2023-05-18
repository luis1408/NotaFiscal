package controller;

import model.*;
import java.util.ArrayList;
public class FaturaController {

    public void clear() {}

    public ArrayList<FaturaModel> fakerFatura(ArrayList<FaturaModel> ListaFatura){

        int x = 10;
        for (int i = 1; i < x; i++){
            FaturaModel fatura = new FaturaModel();
            ValoresModel valoresModel = new ValoresModel();
            DatasModel datasModel = new DatasModel();

            fatura.setId(1);
            valoresModel.setValorTotal(3*i);
            datasModel.setDataVicto(2*i+"/"+2*i+'/'+2*i);

            fatura.setId(2);
            valoresModel.setValorTotal(6*i);
            datasModel.setDataVicto(1*i+"/"+3*i+'/'+2*i);

            fatura.setId(3);
            valoresModel.setValorTotal(5*i);
            datasModel.setDataVicto(2*i+"/"+1*i+'/'+2*i);

            fatura.setDatasModel(datasModel);
            fatura.setValoresModel(valoresModel);            

            ListaFatura.add(fatura);
        }

        for (FaturaModel faturaModel : ListaFatura) {
            System.out.println("\n" + faturaModel.getId());
            System.out.println(faturaModel.getDatasModel().getDataVicto());
            System.out.println(faturaModel.getValoresModel().getValorTotal());
        }
        
        return ListaFatura;
    }
}
