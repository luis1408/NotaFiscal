package controller;

import model.*;
import java.util.ArrayList;

public class FaturasController {
    public ArrayList<FaturaModel> fakerFatura(ArrayList<FaturaModel> ListaFatura) {

        int x = 10;
        for (int i = 1; i < x; i++) {
            FaturaModel faturas = new FaturaModel();
            ValoresModel valoresModel = new ValoresModel();
            DatasModel datasModel = new DatasModel();

            faturas.setId(5);
            valoresModel.setValorTotal(5 * i);
            datasModel.setDataVicto(2 * i + "/" + 2 * i + '/' + 2 * i);

            faturas.setId(6);
            valoresModel.setValorTotal(3 * i);
            datasModel.setDataVicto(1 * i + "/" + 3 * i + '/' + 2 * i);

            faturas.setId(7);
            valoresModel.setValorTotal(4 * i);
            datasModel.setDataVicto(2 * i + "/" + 1 * i + '/' + 2 * i);

            faturas.setDatasModel(datasModel);
            faturas.setValoresModel(valoresModel);

            ListaFatura.add(faturas);
        }

        for (FaturaModel faturaModel : ListaFatura) {
            System.out.println("\n" + faturaModel.getId());
            System.out.println(faturaModel.getDatasModel().getDataVicto());
            System.out.println(faturaModel.getValoresModel().getValorTotal());
        }
        return ListaFatura;
    }
}
