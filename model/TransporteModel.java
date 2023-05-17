package model;

public class TransporteModel {
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
    long codigoANTT;
    String placaDoVeículo;
    int fretePorConta;// 0-Eminente
    String especie;
    int qtd;
    String marca;
    long numeração;
    double pesoBruto;
    double pesoLiquido;
    
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

    public void setCodigoANTT(long codigoANTT) {
        this.codigoANTT = codigoANTT;
    }

    public long getCodigoANTT() {
        return codigoANTT;
    }

    public void setPlacaDoVeículo(String placaDoVeículo) {
        this.placaDoVeículo = placaDoVeículo;
    }

    public String getPlacaDoVeículo() {
        return placaDoVeículo;
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

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }
}