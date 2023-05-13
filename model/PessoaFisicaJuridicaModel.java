package model;

public class PessoaFisicaJuridicaModel {
    long cpfCnpj;
    String nome_razãoSocial;
    PessoaModel pessoaModel;

    public void setCpfCnpj(long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public long getCpfCnpj() {
        return cpfCnpj;
    }

    public void setNome_razãoSocial(String nome_razãoSocial) {
        this.nome_razãoSocial = nome_razãoSocial;
    }

    public String getNome_razãoSocial() {
        return nome_razãoSocial;
    }

    public void setPessoaModel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }

    public PessoaModel getPessoaModel() {
        return pessoaModel;
    }
}
