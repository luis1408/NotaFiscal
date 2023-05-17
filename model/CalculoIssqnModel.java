package model;

public class CalculoIssqnModel {

    ValoresModel valoresModel = new ValoresModel();
    EmissorModel emissorModel = new EmissorModel();

    public void setValoresModel(ValoresModel valoresModel) {
        this.valoresModel = valoresModel;
    }

    public ValoresModel getValoresModel() {
        return valoresModel;
    }

    public void setEmissorModel(EmissorModel emissorModel) {
        this.emissorModel = emissorModel;
    }

    public EmissorModel getEmissorModel() {
        return emissorModel;
    }
}
