package model;

public class RemetenteModel {
    long cpfCnpj;
    String nome_razãoSocial;
    String rua;
    int num;
    String Bairro;
    String Cidade;
    String UF;
    long Cep;
    long inscriçãoEstadual;
    int TelFax;

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

    public void setTelFax(int telFax) {
        TelFax = telFax;
    }

    public int getTelFax() {
        return TelFax;
    }
}
