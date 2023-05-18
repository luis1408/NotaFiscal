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

        for (CalculoImpostosModel calculoImpostosModel : ListaImpostos) {
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
        return ListaImpostos;
    }
}