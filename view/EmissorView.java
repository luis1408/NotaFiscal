package view;

import java.util.Scanner;
//import model.EmissorModel;

public class EmissorView {
    
    Scanner leia = new Scanner(System.in);

    public void entrar(){

        System.out.printf("CADASTRO DE EMISSOR");
        
    
        while(true){
            try {
                System.out.printf("CNPJ: ");
                //set.emissorModel.CNPJ = leia.nextLong();
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
            }
        }
        while(true){
            try {
                System.out.printf("CADASTRO DO ENDEREÇO DE COBRANÇA: ");
                
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
            }
        }    
        //this.cliente.setPessoa_juridica(this.pessoa_juridica);
        //controller.incluir(this.cliente);
    }
    
    
    public void imprimir() {

        //System.out.printf("\nLimite de Credito: %.2f", this.cliente.getLimite_credito());
        //this.endereco = new EnderecoView(this.cliente.getEndereco_cobranca());
        //this.endereco.imprimir();
    }
}
