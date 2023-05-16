package controller;

import model.*;
import java.util.ArrayList;
import java.util.Set;

import view.*;
public class EmissorController {

    public ArrayList<EmissorModel> fakerEmissor(ArrayList<EmissorModel> listaEmissor){

        int x = 10;
        for (int i = 1; i < x; i++){
            EmissorModel emissor = new EmissorModel();
            PessoaModel pessoa = new PessoaModel();
            pessoa.setContatoModel(null);
            pessoa.setEnderecoModel(null);
            pessoa.setInscriçãoEstadual(i);
            emissor.setPessoaModel(pessoa);

        }

        return listaEmissor;
    }
}
