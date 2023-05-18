package controller;

import model.*;
import java.util.ArrayList;

public class TransporteController {

    public void clear() {
    }

    public ArrayList<TransporteModel> fakerTransporte(ArrayList<TransporteModel> ListaTransporte) {

        int x = 10;
        for (int i = 1; i < x; i++) {
            TransporteModel transporte = new TransporteModel();

            transporte.setCpfCnpj(123456789 + i);
            transporte.setNome_razãoSocial("Nome" + i);
            transporte.setRua("Rua" + i);
            transporte.setNum(i);
            transporte.setBairro("Bairro" + i);
            transporte.setCidade("Cidade" + i);
            transporte.setUF("Estado" + i);
            transporte.setCep(123456789 + i);
            transporte.setInscriçãoEstadual(i);
            transporte.setTelFax(12345 - 678 + i);
            transporte.setCodigoANTT(124678 + i);
            transporte.setPlacaDoVeículo("Placa" + i);
            transporte.setFretePorConta(i);
            transporte.setEspecie("Espécie" + i);
            transporte.setQtd(i);
            transporte.setMarca("Marca" + i);
            transporte.setNumeração(1728 + i);
            transporte.setPesoBruto(13 + i);
            transporte.setPesoLiquido(15 + i);

            ListaTransporte.add(transporte);
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
