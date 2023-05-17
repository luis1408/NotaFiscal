package model;

public class FaturaModel {

    ValoresModel valoresModel = new ValoresModel();
    DatasModel datasModel = new DatasModel();

    public void setDatasModel(DatasModel datasModel) {
        this.datasModel = datasModel;
    }

    public DatasModel getDatasModel() {
        return datasModel;
    }

    public void setValoresModel(ValoresModel valoresModel) {
        this.valoresModel = valoresModel;
    }

    public ValoresModel getValoresModel() {
        return valoresModel;
    }
}
