package model;

public class EmissorModel {
    long CNPJ;
    String rua;
    int num;
    String Bairro;
    String Cidade;
    String UF;
    long Cep;
    long inscriçãoEstadual;
    long IncriçãoEstadualSubTributaria;
    long inscricaoMunicipal;
    int TelFax;

    public void setCNPJ(long cNPJ) {
        CNPJ = cNPJ;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    
    public String getBairro() {
        return Bairro;
    }
    
    public void setCep(long cep) {
        Cep = cep;
    }

    public long getCep() {
        return Cep;
    }
    
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    
    public String getCidade() {
        return Cidade;
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
    
    public void setUF(String uF) {
        UF = uF;
    }
    
    public String getUF() {
        return UF;
    }
    
    public void setInscriçãoEstadual(long inscriçãoEstadual) {
        this.inscriçãoEstadual = inscriçãoEstadual;
    }
    
    public long getInscriçãoEstadual() {
        return inscriçãoEstadual;
    }
    
    public void setIncriçãoEstadualSubTributaria(long incriçãoEstadualSubTributaria) {
        IncriçãoEstadualSubTributaria = incriçãoEstadualSubTributaria;
    }

    public long getIncriçãoEstadualSubTributaria() {
        return IncriçãoEstadualSubTributaria;
    }

    public void setInscricaoMunicipal(long inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public long getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }
    
    public void setTelFax(int telFax) {
        TelFax = telFax;
    }

    public int getTelFax() {
        return TelFax;
    }
}
