package controller;

import model.*;
import java.util.ArrayList;
public class CalculoImpostosController {

    public void clear() {}
    
    

    public ArrayList<CalculoImpostosModel> fakerCalculoImpostos(ArrayList<CalculoImpostosModel> listaImpostos){

        int x = 10;
        for (int i = 1; i < x; i++){
            CalculoImpostosModel calculoImposto = new CalculoImpostosModel();
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
            
        
                  
            calculoImposto.setValoresModel(valoresModel);

            listaImpostos.add(calculoImposto);
            
        }

        for(int i = 1; i < x; i++){
    
            System.out.println(listaImpostos.get(i).getValoresModel().getBaseDeCalculoDeIcms());
            listaImpostos.get(i).getValoresModel().getBaseDeCalculoDeIcms();
            listaImpostos.get(i).getValoresModel().getBaseDeCalculoDeIcmsSubstituicao();
            listaImpostos.get(i).getValoresModel().getValorDoICMS();
            listaImpostos.get(i).getValoresModel().getValorDoIcmsSubstituicao();
            listaImpostos.get(i).getValoresModel().getValorTotalDosProdutos();
            listaImpostos.get(i).getValoresModel().getValorDoFrete();
            listaImpostos.get(i).getValoresModel().getValorDoSeguro();
            listaImpostos.get(i).getValoresModel().getDesconto();
            listaImpostos.get(i).getValoresModel().getOutrasDespesasAcessorias();
            listaImpostos.get(i).getValoresModel().getValorIpi();
            listaImpostos.get(i).getValoresModel().getValorTotalDosImpostos();
            listaImpostos.get(i).getValoresModel().getValorTotalDaNota();
        }

        return listaImpostos;
        
    }

    public int size() {
        return 0;
    }

    public char[] get(int i) {
        return null;
    }
   
}