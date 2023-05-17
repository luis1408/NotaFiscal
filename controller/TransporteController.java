package controller;

import model.*;
import java.util.ArrayList;
public class TransporteController {

    public ArrayList<TransporteModel> fakerTransporte(ArrayList<TransporteModel> ListaTransporte){

        int x = 10;
        for (int i = 1; i < x; i++){
            TransporteModel transporte = new TransporteModel();
            
            transporte.setCpfCnpj(123456789 + i);
            transporte.setNome_razãoSocial("Nome" + i);
            transporte.setRua("Rua"+i);
            transporte.setNum(i);
            transporte.setBairro("Bairro" + i);
            transporte.setCidade("Cidade" + i);
            transporte.setUF("Estado" + i);
            transporte.setCep(123456789 + i);
            transporte.setInscriçãoEstadual(i);
            transporte.setTelFax(12345-678 + i);
            transporte.setCodigoANTT(124678 + i);
            transporte.setPlacaDoVeículo("Placa" + i);
            transporte.setFretePorConta(i);
            transporte.setEspecie("Espécie"+ i);
            transporte.setQtd(i);
            transporte.setMarca("Marca" + i);
            transporte.setNumeração(1728 + i);
            transporte.setPesoBruto(13 + i);
            transporte.setPesoLiquido(15 + i);

            ListaTransporte.add(transporte);
        }
        return ListaTransporte;
    }
}
