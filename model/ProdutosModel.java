package model;

public class ProdutosModel {
    long cod;
    String descriçãoDoProduto;
    long ncmSw;
    int cts;
    int cfop;
    int unid;
    int qtd;

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public long getCod() {
        return cod;
    }

    public void setCts(int cts) {
        this.cts = cts;
    }

    public int getCts() {
        return cts;
    }

    public void setDescriçãoDoProduto(String descriçãoDoProduto) {
        this.descriçãoDoProduto = descriçãoDoProduto;
    }

    public String getDescriçãoDoProduto() {
        return descriçãoDoProduto;
    }

    public void setNcmSw(long ncmSw) {
        this.ncmSw = ncmSw;
    }

    public long getNcmSw() {
        return ncmSw;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setUnid(int unid) {
        this.unid = unid;
    }

    public int getUnid() {
        return unid;
    }
}
