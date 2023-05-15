package view;
import model.PessoaModel;
import model.EmissorModel;
public class EmissorView {
    
    public void entrar(){

        System.out.printf("CADASTRO DE EMISSOR");
        
        while(true){
            try {
                System.out.printf("Informe o limite de crédito do cliente: ");
                cliente.setLimite_credito(faker.gerarValor());
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
            }
        }
        while(true){
            try {
                System.out.printf("CADASTRO DO ENDEREÇO DE COBRANÇA: ");
                cliente.setEndereco_cobranca(new EnderecoView().getEndereco());
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
            }
        }    
        this.cliente.setPessoa_juridica(this.pessoa_juridica);
        //controller.incluir(this.cliente);
    }
    
    
    public void imprimir() {
        super.imprimir();

        System.out.printf("\nLimite de Credito: %.2f", this.cliente.getLimite_credito());
        this.endereco = new EnderecoView(this.cliente.getEndereco_cobranca());
        this.endereco.imprimir();
    }
}
