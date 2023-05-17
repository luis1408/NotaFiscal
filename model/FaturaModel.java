package model;

public class FaturaModel {

    ValoresModel valoresModel = new ValoresModel();
    DatasModel datasModel = new DatasModel();
    int id;

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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
