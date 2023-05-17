package controller;

import model.*;
import java.util.ArrayList;
public class DatasController {

    public ArrayList<DatasModel> fakerDatas(ArrayList<DatasModel> ListaDatas){

        int x = 10;
        for (int i = 1; i < x; i++){
            DatasModel datas = new DatasModel();
            
            datas.setDataDaEmissão(i + "/" + i + "/" + 20 + i);
            datas.setDataDeSaidaEntrada(i + "/" + x + "/" + 20 + i);
            datas.setHoraDeSaída(i +"h"+ i + "min");
            datas.setDataVicto(i + "/" + i + "/" + 20 + x);
            

            ListaDatas.add(datas);
        }
        return ListaDatas;
    }
}
