package controller;

import model.*;
import java.util.ArrayList;
public class CalculoImpostosController {

    public void clear() {}
    
    

    public ArrayList<CalculoImpostosModel> fakerCalculoImpostos(ArrayList<CalculoImpostosModel> ListaImpostos){

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

            ListaImpostos.add(calculoImposto);
            
        }
        return ListaImpostos;
    }

	public long[] toArray() {
		return null;
	}

    public int size() {
        return 0;
    }

    public char[] get(int i) {
        return null;
    }
   
}