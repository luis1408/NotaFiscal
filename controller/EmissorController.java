package controller;

import model.*;
import java.util.ArrayList;

public class EmissorController {

    public void clear() {}

    public ArrayList<EmissorModel> fakerEmissor(ArrayList<EmissorModel> listaEmissor){

        int x = 10;
        for (int i = 1; i < x; i++){
            EmissorModel emissor = new EmissorModel();
            
            emissor.setCnpj(123456789 + i);
            emissor.setRua("Rua"+i);
            emissor.setNum(i);
            emissor.setBairro("Bairro" + i);
            emissor.setCidade("Cidade" + i);
            emissor.setUf("Estado" + i);
            emissor.setCep(123456789 + i);
            emissor.setInscriçãoEstadual(i);
            emissor.setIncriçãoEstadualSubTributaria(123456789 + i);
            emissor.setInscricaoMunicipal(123456789 + i);
            emissor.setTelFax(12345-678 + i);

            listaEmissor.add(emissor);
        }
        return listaEmissor;
    }  
}
