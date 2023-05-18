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

        for (TransporteModel transporteModel : ListaTransporte) {
            System.out.println(transporteModel.getCpfCnpj());
            System.out.println(transporteModel.getNome_razãoSocial());
            System.out.println(transporteModel.getRua());
            System.out.println(transporteModel.getNum());
            System.out.println(transporteModel.getBairro());
            System.out.println(transporteModel.getCidade());
            System.out.println(transporteModel.getUF());
            System.out.println(transporteModel.getCep());
            System.out.println(transporteModel.getInscriçãoEstadual());
            System.out.println(transporteModel.getTelFax());
            System.out.println(transporteModel.getCodigoANTT());
            System.out.println(transporteModel.getPlacaDoVeículo());
            System.out.println(transporteModel.getFretePorConta());
            System.out.println(transporteModel.getEspecie());
            System.out.println(transporteModel.getQtd());
            System.out.println(transporteModel.getMarca());
            System.out.println(transporteModel.getNumeração());
            System.out.println(transporteModel.getPesoBruto());
            System.out.println(transporteModel.getPesoLiquido());

        }
        
        return ListaTransporte;
    }
}