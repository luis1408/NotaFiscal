package model;

public class PessoaModel {
    long inscriçãoEstadual;
    EnderecoModel enderecoModel;
    ContatoModel contatoModel;

    public void setContatoModel(ContatoModel contatoModel) {
        this.contatoModel = contatoModel;
    }

    public ContatoModel getContatoModel() {
        return contatoModel;
    }

    public void setEnderecoModel(EnderecoModel enderecoModel) {
        this.enderecoModel = enderecoModel;
    }

    public EnderecoModel getEnderecoModel() {
        return enderecoModel;
    }

    public void setInscriçãoEstadual(long inscriçãoEstadual) {
        this.inscriçãoEstadual = inscriçãoEstadual;
    }

    public long getInscriçãoEstadual() {
        return inscriçãoEstadual;
    }
}