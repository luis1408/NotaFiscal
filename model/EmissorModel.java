package model;

public class EmissorModel {
    long CNPJ; 
    long IncriçãoEstadualSubTributaria;
    PessoaModel pessoaModel;

    public void setCNPJ(long cNPJ) {
        CNPJ = cNPJ;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setIncriçãoEstadualSubTributaria(long incriçãoEstadualSubTributaria) {
        IncriçãoEstadualSubTributaria = incriçãoEstadualSubTributaria;
    }

    public long getIncriçãoEstadualSubTributaria() {
        return IncriçãoEstadualSubTributaria;
    }

    public void setPessoaModel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }

    public PessoaModel getPessoaModel() {
        return pessoaModel;
    }
}
