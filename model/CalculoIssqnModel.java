package model;

public class CalculoIssqnModel {

    ValoresModel valoresModel;
    InscricaoMunicipalModel inscricaoMunicipalModel;

    public void setInscricaoMunicipalModel(InscricaoMunicipalModel inscricaoMunicipalModel) {
        this.inscricaoMunicipalModel = inscricaoMunicipalModel;
    }

    public InscricaoMunicipalModel getInscricaoMunicipalModel() {
        return inscricaoMunicipalModel;
    }

    public void setValoresModel(ValoresModel valoresModel) {
        this.valoresModel = valoresModel;
    }

    public ValoresModel getValoresModel() {
        return valoresModel;
    }
}
