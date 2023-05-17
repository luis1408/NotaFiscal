package controller;

import model.*;
import java.util.ArrayList;

public class CalculosImpostosController{
    public ArrayList<CalculoImpostosModel> fakerCalculoImpostos(ArrayList<CalculoImpostosModel> ListaImpostos){

        int x = 10;
        for (int i = 2; i < x; i++){
            CalculoImpostosModel calculoImpostos = new CalculoImpostosModel();
            ValoresModel valoresModel = new ValoresModel();

            valoresModel.setBaseDeCalculoDeIcms(i+i);
            valoresModel.setBaseDeCalculoDeIcmsSubstituicao(i);
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
            
        
                  
            calculoImpostos.setValoresModel(valoresModel);

            ListaImpostos.add(calculoImpostos);
        }
        return ListaImpostos;
    }
}