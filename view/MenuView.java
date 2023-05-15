package view;
import java.util.ArrayList;
import java.util.Scanner;

import controller.*;
import model.*;
public class MenuView {

        private ArrayList<CalculoImpostosModel> ListaImpostos = new ArrayList<CalculoImpostosModel>();
        private ArrayList<CalculoIssqnModel> ListaCalculoIssqn = new ArrayList<CalculoIssqnModel>();
        private ArrayList<DadosFiscaisModel> ListaDadosFiscais = new ArrayList<DadosFiscaisModel>();
        private ArrayList<DatasModel> ListaDatas = new ArrayList<DatasModel>();
        private ArrayList<EmissorModel> ListaEmissor = new ArrayList<EmissorModel>();
        private ArrayList<FaturaModel> ListaEFatura = new ArrayList<FaturaModel>();
        private ArrayList<ProdutosModel> ListaPordutos = new ArrayList<ProdutosModel>();
        private ArrayList<RemetenteModel> ListaRemetente = new ArrayList<RemetenteModel>();
        private ArrayList<TransporteModel> ListaTransporte = new ArrayList<TransporteModel>();
        private ArrayList<ValoresModel> ListaValores = new ArrayList<ValoresModel>();

        Scanner leia = new Scanner(System.in).useDelimiter("\r?\n");

    public MenuView() {
        boolean executar = true;
        while(executar) {
            executar = menuPrincupal();
        }
    }

    public boolean menuPrincupal() {
        String subMenu;
        String cnpj;
        int id;
        int posicao;
        int numero;
        Double valor;

        

        System.out.printf(
                "\n\n1. Incluir\n2. Alterar NF-e\n3. Excluir NF-e\n4. Consultar \n5. Listagem de NF-e\n6. Sair\n:: ");
        int opcao = leia.nextInt();
        switch (opcao) {
            case 1:
                //System.out.println("Quantidade: ");
                //int x = leia.nextInt();

                EmissorController faker = new EmissorController(); 
                ListaEmissor = faker.fakerEmissor(ListaEmissor);
                
                break;
            case 2:
                System.out.printf(
                        "\na. Alterar Destinatário/Remetente\nb. Alterar Fatura\nc. Alterar Cálculo do Imposto\nd. Alterar Transportadora\n:: ");
                subMenu = leia.next();
                switch (subMenu) {
                    case "a":
                        System.out.println("Quantidade: ");
                        int x = leia.nextInt();
                        this.clienteView.entrar();
                        this.clienteController.incluir(this.clienteView.getCliente(), x);
                        break;
                    case "b":
                        System.out.printf("\nInforme o ID: ");
                        id = leia.nextInt();
                        this.clienteView.entrar();
                        this.clienteController.alterar(id, this.clienteView.getCliente());
                        break;
                    case "c":
                        System.out.printf("\nInforme a posicao na lista: ");
                        posicao = leia.nextInt();
                        this.clienteView = new ClienteView(this.clienteController.consultarPosicao(posicao));
                        this.clienteView.imprimir();
                        break;
                    case "d":
                        System.out.printf("\nInforme o ID: ");
                        id = leia.nextInt();
                        this.clienteView = new ClienteView(this.clienteController.consutarId(id));
                        this.clienteView.imprimir();
                        break;
                }
                break;
            case 3:
                
                }
                break;
            case 4:
                System.out.printf(
                        "\na. Consulta pelo número da NF-e\nb. Consulta pela razão social do cliente\nc. Consulta pelo CNPJ/CPF do cliente\nd. Consulta pelo valor total da NF-e\n   :: ");
                subMenu = leia.next();
                switch (subMenu) {
                    case "a":
                        System.out.println("Quantidade: ");
                        int x = leia.nextInt();
                        this.receberView.entrar();
                        this.receberController.incluir(this.receberView.getReceber(), x);
                        break;
                    case "b":
                        System.out.printf("\nInforme o número: ");
                        numero = leia.nextInt();
                        this.receberView.entrar();
                        this.receberController.alterarPeloNumero(numero);
                        break;
                    case "c":
                        System.out.printf("\nInforme o nome do cliente: ");
                        String nome = leia.next();
                        id = this.clienteController.consutarNome(nome).getId();
                        this.receberView = new ReceberView(this.receberController.consultarPeloCliente(id));
                        this.receberView.imprimir();
                        break;
                    case "d":
                        System.out.printf("\nInforme o número: ");
                        numero = leia.nextInt();
                        this.receberView = new ReceberView(this.receberController.consultarPeloNumero(numero));
                        this.receberView.imprimir();
                        break;
                }
                break;
            case 5:
                
                break;
            case 6:
                return false;
            default:
                System.out.printf("\nOpção inválida");
                break;
        }
        return true;
    }
}
