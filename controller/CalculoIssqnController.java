package controller;

import model.*;
import java.util.ArrayList;
public class CalculoIssqnController{

    public void clear() {}

    public ArrayList<CalculoIssqnModel> fakerCalculoIssqn(ArrayList<CalculoIssqnModel> ListaCalculoIssqn){

        int x = 10;
        for (int i = 1; i < x; i++){
            CalculoIssqnModel calculoIssqn = new CalculoIssqnModel();
            ValoresModel valoresModel = new ValoresModel();
            EmissorModel emissorModel = new EmissorModel(); 

            emissorModel.setInscricaoMunicipal(i);
            valoresModel.setBaseDoCalculoDoISSQN(i+i);           
            valoresModel.setValorTotal((10*i)+i+i+i+i+i+i+i-i);                 
            valoresModel.setValorDoISSQN(i);

            calculoIssqn.setValoresModel(valoresModel);
            calculoIssqn.setEmissorModel(emissorModel);

            ListaCalculoIssqn.add(calculoIssqn);
        }
        return ListaCalculoIssqn;
    }
}
