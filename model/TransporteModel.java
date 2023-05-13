package model;

public class TransporteModel {
    int fretePorConta;// 0-Eminente
    String especie;
    int qtd;
    String marca;
    long numeração;
    double pesoBruto;
    double esoLiquido;
    TransportadorModel transportadorModel;

    public void setEsoLiquido(double esoLiquido) {
        this.esoLiquido = esoLiquido;
    }

    public double getEsoLiquido() {
        return esoLiquido;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setFretePorConta(int fretePorConta) {
        this.fretePorConta = fretePorConta;
    }

    public int getFretePorConta() {
        return fretePorConta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setNumeração(long numeração) {
        this.numeração = numeração;
    }

    public long getNumeração() {
        return numeração;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setTransportadorModel(TransportadorModel transportadorModel) {
        this.transportadorModel = transportadorModel;
    }

    public TransportadorModel getTransportadorModel() {
        return transportadorModel;
    }
}
