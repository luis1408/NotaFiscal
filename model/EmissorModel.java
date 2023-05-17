package model;

public class EmissorModel {
    long cnpj;
    String rua;
    int num;
    String bairro;
    String cidade;
    String uf;
    long cep;
    long inscriçãoEstadual;
    long incriçãoEstadualSubTributaria;
    long inscricaoMunicipal;
    int telFax;

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setCep(long cep) {
        this.cep = cep;
    }

    public long getCep() {
        return cep;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getRua() {
        return rua;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setInscriçãoEstadual(long inscriçãoEstadual) {
        this.inscriçãoEstadual = inscriçãoEstadual;
    }
    
    public long getInscriçãoEstadual() {
        return inscriçãoEstadual;
    }
    
    public void setIncriçãoEstadualSubTributaria(long incriçãoEstadualSubTributaria) {
        this.incriçãoEstadualSubTributaria = incriçãoEstadualSubTributaria;
    }

    public long getIncriçãoEstadualSubTributaria() {
        return incriçãoEstadualSubTributaria;
    }

    public void setInscricaoMunicipal(long inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public long getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }
    
    public void setTelFax(int telFax) {
        this.telFax = telFax;
    }

    public int getTelFax() {
        return telFax;
    }
}
