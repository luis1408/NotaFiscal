package controller;

import model.*;
import java.util.ArrayList;

public class RemetentesController {

    public ArrayList<RemetenteModel> fakerRemetente(ArrayList<RemetenteModel> ListaRemetente){

        int x = 10;
        for (int i = 1; i < x; i++){
            RemetenteModel remetentes = new RemetenteModel();
            
            remetentes.setCpfCnpj(12345678 + i + i);
            remetentes.setNome_razãoSocial("Nome" + i + i);
            remetentes.setRua("Rua" + i + i);
            remetentes.setNum(i + i);
            remetentes.setBairro("Bairro"+ i + i);
            remetentes.setCidade("Cidade"+ i + i);
            remetentes.setUF("Estado" + i + i);
            remetentes.setCep(123456789 + i + i);
            remetentes.setInscriçãoEstadual(i  + i);
            remetentes.setTelFax(12345-678 + i + i);

            ListaRemetente.add(remetentes);
        }

        for (RemetenteModel remetente : ListaRemetente) {
            System.out.println("\n" + remetente.getBairro());
            System.out.println(remetente.getCep());
            System.out.println(remetente.getCidade());
            System.out.println(remetente.getInscriçãoEstadual());
            System.out.println(remetente.getNome_razãoSocial());
            System.out.println(remetente.getRua());
        }

        return ListaRemetente;
    }
}
