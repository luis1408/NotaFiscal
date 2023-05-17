package model;

public class DadosFiscaisModel {
    long numero;
    int serie;
    int Entrada_Saida;
    long ChaveDeAcesso;
    String NaturezaDaOperação;
    long ProtocoloDeAutorizaçãoDeUso;
    String site = "www.nfe.fazenda.gov.br/portal ou site da Sefaz Autorizadora";
    DatasModel datasModel = new DatasModel();

    public void setNumero(long numero) {
        this.numero = numero;
    }
    public long getNumero() {
        return numero;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public void setEntrada_Saida(int entrada_Saida) {
        Entrada_Saida = entrada_Saida;
    }

    public int getEntrada_Saida() {
        return Entrada_Saida;
    }

    public void setChaveDeAcesso(long chaveDeAcesso) {
        ChaveDeAcesso = chaveDeAcesso;
    }

    public long getChaveDeAcesso() {
        return ChaveDeAcesso;
    }

    public void setNaturezaDaOperação(String naturezaDaOperação) {
        NaturezaDaOperação = naturezaDaOperação;
    }

    public String getNaturezaDaOperação() {
        return NaturezaDaOperação;
    }

    public void setProtocoloDeAutorizaçãoDeUso(long protocoloDeAutorizaçãoDeUso) {
        ProtocoloDeAutorizaçãoDeUso = protocoloDeAutorizaçãoDeUso;
    }

    public long getProtocoloDeAutorizaçãoDeUso() {
        return ProtocoloDeAutorizaçãoDeUso;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    public void setDatasModel(DatasModel datasModel) {
        this.datasModel = datasModel;
    }

    public DatasModel getDatasModel() {
        return datasModel;
    }
}