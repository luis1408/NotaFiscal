package controller;

import model.*;
import java.util.ArrayList;
public class ProdutosController {

    public void clear() {}

    public ArrayList<ProdutosModel> fakerProdutos(ArrayList<ProdutosModel> ListaProdutos){

        int x = 10;
        for (int i = 1; i < x; i++){
            ProdutosModel produtos = new ProdutosModel();
            ValoresModel valoresModel = new ValoresModel();
            
            produtos.setCod(i);
            produtos.setDescriçãoDoProduto("Produto"+ i);
            produtos.setNcmSw(+i+i+i+i+i+i+i);
            produtos.setCts(i-i);
            produtos.setCfop(i+i+i);
            produtos.setUnid(i*6);
            produtos.setQtd(i);

            valoresModel.setValorUnitario(i);
            valoresModel.setValorTotal((10*i)+i+i+i+i+i+i+i-i);
            valoresModel.setBaseDeCalculoDeIcms(i+i);
            valoresModel.setBaseDeCalculoDeIcmsSubstituicao(i);
            valoresModel.setValorDoIcmsSubstituicao(i-i);
            valoresModel.setValorDoICMS(i);
            valoresModel.setValorIpi(i);
            valoresModel.setValorPis(i);
            valoresModel.setValorConfins(i);
            valoresModel.setValorTotalDosImpostos(i+i+i+i);
            
            produtos.setValoresModel(valoresModel);

            ListaProdutos.add(produtos);
        }
        return ListaProdutos;
    }
}
