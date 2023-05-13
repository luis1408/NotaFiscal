package model;

public class TransportadorModel {
    PessoaFisicaJuridicaModel pessoaFisicaJuridicaModel;
    long codigoANTT;
    String placaDoVeículo;

    public void setCodigoANTT(long codigoANTT) {
        this.codigoANTT = codigoANTT;
    }

    public long getCodigoANTT() {
        return codigoANTT;
    }

    public void setPessoaFisicaJuridicaModel(PessoaFisicaJuridicaModel pessoaFisicaJuridicaModel) {
        this.pessoaFisicaJuridicaModel = pessoaFisicaJuridicaModel;
    }

    public PessoaFisicaJuridicaModel getPessoaFisicaJuridicaModel() {
        return pessoaFisicaJuridicaModel;
    }

    public void setPlacaDoVeículo(String placaDoVeículo) {
        this.placaDoVeículo = placaDoVeículo;
    }

    public String getPlacaDoVeículo() {
        return placaDoVeículo;
    }
}