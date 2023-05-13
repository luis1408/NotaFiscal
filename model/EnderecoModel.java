package model;

public class EnderecoModel {
    String rua;
    int num;
    String Bairro;
    String Cidade;
    String UF;
    long Cep;

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
}

