package controller;

import model.*;
import java.util.ArrayList;
public class TransportesController {

    public ArrayList<TransporteModel> fakerTransporte(ArrayList<TransporteModel> ListaTransporte){

        int x = 10;
        for (int i = 2; i < x; i++){
            TransporteModel transportes = new TransporteModel();
            
            transportes.setCpfCnpj(123456789 + i);
            transportes.setNome_razãoSocial("Nome" + i);
            transportes.setRua("Rua"+i);
            transportes.setNum(i);
            transportes.setBairro("Bairro" + i);
            transportes.setCidade("Cidade" + i);
            transportes.setUF("Estado" + i);
            transportes.setCep(123456789 + i);
            transportes.setInscriçãoEstadual(i);
            transportes.setTelFax(12345-678 + i);
            transportes.setCodigoANTT(124678 + i);
            transportes.setPlacaDoVeículo("Placa" + i);
            transportes.setFretePorConta(i);
            transportes.setEspecie("Espécie"+ i);
            transportes.setQtd(i);
            transportes.setMarca("Marca" + i);
            transportes.setNumeração(1728 + i);
            transportes.setPesoBruto(13 + i);
            transportes.setPesoLiquido(15 + i);

            ListaTransporte.add(transportes);
        }
        return ListaTransporte;
    }
}