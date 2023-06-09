package controller;

import model.*;
import java.util.ArrayList;

public class RemetenteController {
    
    public void clear() {}

    public ArrayList<RemetenteModel> fakerRemetente(ArrayList<RemetenteModel> listaRemetente){

        int x = 10;
        for (int i = 1; i < x; i++){
            RemetenteModel remetente = new RemetenteModel();
            
            remetente.setCpfCnpj(123456789 + i);
            remetente.setNome_razãoSocial("Nome" + i);
            remetente.setRua("Rua" + i);
            remetente.setNum(i);
            remetente.setBairro("Bairro" + i);
            remetente.setCidade("Cidade" + i);
            remetente.setUF("Estado" + i);
            remetente.setCep(123456789 + i);
            remetente.setInscriçãoEstadual(i);
            remetente.setTelFax(12345-678 + i);

            listaRemetente.add(remetente);
        }

        for (RemetenteModel remetente : listaRemetente) {
            System.out.println("\n" + remetente.getBairro());
            System.out.println(remetente.getCep());
            System.out.println(remetente.getCidade());
            System.out.println(remetente.getInscriçãoEstadual());
            System.out.println(remetente.getNome_razãoSocial());
            System.out.println(remetente.getRua());
        }

        
        return listaRemetente;
    }
}
