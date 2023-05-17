package controller;

import model.*;
import java.util.ArrayList;
public class ValoresController {
    
    public void clear() {}

    public ArrayList<ValoresModel> fakerValores(ArrayList<ValoresModel> ListaValores){

        int x = 10;
        for (int i = 1; i < x; i++){
            ValoresModel valoresModel = new ValoresModel();

            valoresModel.setBaseDeCalculoDeIcms(i+i);
            valoresModel.setBaseDeCalculoDeIcmsSubstituicao(i);
            valoresModel.setBaseDoCalculoDoISSQN(i+i);
            valoresModel.setValorDoICMS(i);
            valoresModel.setValorDoIcmsSubstituicao(i-i);
            valoresModel.setValorTotalDosProdutos(x*i);
            valoresModel.setValorDoFrete(i);
            valoresModel.setValorDoSeguro(i);
            valoresModel.setDesconto(i);
            valoresModel.setOutrasDespesasAcessorias(i);
            valoresModel.setValorIpi(i);
            valoresModel.setValorTotalDosImpostos(i+i+i+i);
            valoresModel.setValorTotalDaNota(1);
            valoresModel.setValorUnitario(i);
            valoresModel.setValorTotal((10*i)+i+i+i+i+i+i+i-i);
            valoresModel.setValorPis(i);
            valoresModel.setValorConfins(i);
            valoresModel.setValorDoISSQN(i);

            ListaValores.add(valoresModel);
        }
        return ListaValores;
    }
}
