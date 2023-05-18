package controller;

import model.*;
import java.util.ArrayList;
public class CalculoImpostosController {

    public void clear() {}
    
    
    CalculoImpostosModel calculoImposto = new CalculoImpostosModel();
    ValoresModel valoresModel = new ValoresModel();

    public ArrayList<CalculoImpostosModel> fakerCalculoImpostos(ArrayList<CalculoImpostosModel> listaImpostos){

        int x = 10;
        for (int i = 1; i < x; i++){

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

        for (CalculoImpostosModel calculoImpostosModel : listaImpostos) {
            System.out.println("\nICMS " + calculoImpostosModel.getValoresModel().getBaseDeCalculoDeIcms());
            System.out.println("Calculo de Substituiçao " + calculoImpostosModel.getValoresModel().getBaseDeCalculoDeIcmsSubstituicao());
            System.out.println("ISSQN " + calculoImpostosModel.getValoresModel().getBaseDoCalculoDoISSQN());
            System.out.println("Desconto " + calculoImpostosModel.getValoresModel().getDesconto());
            System.out.println("Despesas Acessoria " + calculoImpostosModel.getValoresModel().getOutrasDespesasAcessorias());
            System.out.println("Cofins " + calculoImpostosModel.getValoresModel().getValorConfins());
            System.out.println("Frete " + calculoImpostosModel.getValoresModel().getValorDoFrete());
            System.out.println("ICMS " + calculoImpostosModel.getValoresModel().getValorDoICMS());
            System.out.println("ISSQN " + calculoImpostosModel.getValoresModel().getValorDoISSQN());
            System.out.println("Substituicao " + calculoImpostosModel.getValoresModel().getValorDoIcmsSubstituicao());
            System.out.println("Seguro " + calculoImpostosModel.getValoresModel().getValorDoSeguro());
            System.out.println("IPI " + calculoImpostosModel.getValoresModel().getValorIpi());

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