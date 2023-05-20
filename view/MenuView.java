package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.*;
import model.*;

public class MenuView {

    private ArrayList<CalculoImpostosModel> listaImpostos = new ArrayList<CalculoImpostosModel>();
    private ArrayList<CalculoIssqnModel> ListaCalculoIssqn = new ArrayList<CalculoIssqnModel>();
    private ArrayList<DadosFiscaisModel> ListaDadosFiscais = new ArrayList<DadosFiscaisModel>();
    private ArrayList<DatasModel> ListaDatas = new ArrayList<DatasModel>();
    private ArrayList<EmissorModel> ListaEmissor = new ArrayList<EmissorModel>();
    private ArrayList<FaturaModel> ListaFatura = new ArrayList<FaturaModel>();
    private ArrayList<ProdutosModel> ListaProdutos = new ArrayList<ProdutosModel>();
    private ArrayList<RemetenteModel> ListaRemetente = new ArrayList<RemetenteModel>();
    private ArrayList<TransporteModel> ListaTransporte = new ArrayList<TransporteModel>();
    private ArrayList<ValoresModel> ListaValores = new ArrayList<ValoresModel>();

    CalculoImpostosController calculoImposto = new CalculoImpostosController();

    CalculoIssqnController calculoIssqn = new CalculoIssqnController();

    DadosFiscaisController dadosFiscais = new DadosFiscaisController();

    DatasController datas = new DatasController();

    EmissorController emissor = new EmissorController();

    FaturaController fatura = new FaturaController();

    ProdutosController produtos = new ProdutosController();

    RemetenteController remetente = new RemetenteController();

    TransporteController transporte = new TransporteController();

    ValoresController valores = new ValoresController();

    Scanner leia = new Scanner(System.in).useDelimiter("\r?\n");

    public MenuView() {
        boolean executar = true;
        while (executar) {
            executar = menuPrincupal();
        }
    }

    String subMenu;
    int opcao;
    int num;
    String rs;
    long cpfCnpj;
    long valorTotal;

    public boolean menuPrincupal() {

        try {
            System.out.printf(
                    "\n\n1. Incluir\n2. Alterar NF-e\n3. Excluir NF-e\n4. Consultar \n5. Listagem de NF-e\n6. Sair\n:: ");
            opcao = leia.nextInt();
        } catch (Exception e) {
            System.out.println("Opção Invalída!");
            opcao = leia.nextInt();
        }
        switch (opcao) {
            case 1:
                CalculoImpostosController calculoImposto = new CalculoImpostosController();
                this.listaImpostos = calculoImposto.fakerCalculoImpostos(listaImpostos);
                CalculoIssqnController calculoIssqn = new CalculoIssqnController();
                this.ListaCalculoIssqn = calculoIssqn.fakerCalculoIssqn(ListaCalculoIssqn);
                DadosFiscaisController dadosFiscais = new DadosFiscaisController();
                this.ListaDadosFiscais = dadosFiscais.fakerDadosFiscais(ListaDadosFiscais);
                DatasController datas = new DatasController();
                this.ListaDatas = datas.fakerDatas(ListaDatas);
                EmissorController emissor = new EmissorController();
                this.ListaEmissor = emissor.fakerEmissor(ListaEmissor);
                FaturaController fatura = new FaturaController();
                this.ListaFatura = fatura.fakerFatura(ListaFatura);
                ProdutosController produtos = new ProdutosController();
                this.ListaProdutos = produtos.fakerProdutos(ListaProdutos);
                RemetenteController remetente = new RemetenteController();
                this.ListaRemetente = remetente.fakerRemetente(ListaRemetente);
                TransporteController transporte = new TransporteController();
                this.ListaTransporte = transporte.fakerTransporte(ListaTransporte);
                ValoresController valores = new ValoresController();
                this.ListaValores = valores.fakerValores(ListaValores);

                break;
            case 2:
                System.out.printf(
                        "\na. Alterar Destinatário/Remetente\nb. Alterar Fatura\nc. Alterar Cálculo do Imposto\nd. Alterar Transportadora\n:: ");
                subMenu = leia.next();
                switch (subMenu) {
                    case "a":
                        RemetentesController remetentes = new RemetentesController();
                        ListaRemetente = remetentes.fakerRemetente(ListaRemetente);
                        break;
                    case "b":
                        FaturaController faturas = new FaturaController();
                        ListaFatura = faturas.fakerFatura(ListaFatura);
                        break;
                    case "c":
                        CalculoImpostosController calculoImpostos = new CalculoImpostosController();
                        listaImpostos = calculoImpostos.fakerCalculoImpostos(listaImpostos);
                        break;
                    case "d":
                        TransporteController transportes = new TransporteController();
                        ListaTransporte = transportes.fakerTransporte(ListaTransporte);
                        break;

                }
                break;
            case 3:
                listaImpostos = new ArrayList<CalculoImpostosModel>();
                ListaCalculoIssqn = new ArrayList<CalculoIssqnModel>();
                ListaDadosFiscais = new ArrayList<DadosFiscaisModel>();
                ListaDatas = new ArrayList<DatasModel>();
                ListaEmissor = new ArrayList<EmissorModel>();
                ListaFatura = new ArrayList<FaturaModel>();
                ListaProdutos = new ArrayList<ProdutosModel>();
                ListaRemetente = new ArrayList<RemetenteModel>();
                ListaTransporte = new ArrayList<TransporteModel>();
                ListaValores = new ArrayList<ValoresModel>();
                calculoImposto = new CalculoImpostosController();
                calculoIssqn = new CalculoIssqnController();
                dadosFiscais = new DadosFiscaisController();
                datas = new DatasController();
                emissor = new EmissorController();
                fatura = new FaturaController();
                produtos = new ProdutosController();
                remetente = new RemetenteController();
                transporte = new TransporteController();
                valores = new ValoresController();
                break;
            case 4:

                try {
                    System.out.printf(
                            "\na. Consulta pelo número da NF-e\nb. Consulta pela razão social do cliente\nc. Consulta pelo CNPJ/CPF do cliente\nd. Consulta pelo valor total da NF-e\n   :: ");
                    subMenu = leia.next();
                    break;
                } catch (Exception e) {
                    System.out.println("Opção Invalída!");
                    subMenu = leia.next();
                }
                switch (subMenu) {
                    case "a":
                        try {
                            System.out.println("\nNúmero:\n   :: ");
                            num = leia.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Opção Invalída!");
                            num = leia.nextInt();
                        }

                        break;
                    case "b":
                        try {
                            System.out.println("\nRazão Social:\n   :: ");
                            rs = leia.next();
                            break;
                        } catch (Exception e) {
                            System.out.println("Opção Invalída!");
                            rs = leia.next();
                        }

                        break;
                    case "c":
                        try {
                            System.out.println("\nCNPJ/CPF:\n   :: ");
                            cpfCnpj = leia.nextLong();
                            break;
                        } catch (Exception e) {
                            System.out.println("Opção Invalída!");
                            cpfCnpj = leia.nextLong();
                        }

                        break;
                    case "d":
                        try {
                            System.out.println("\nValor Total:\n   :: ");
                            valorTotal = leia.nextLong();
                            break;
                        } catch (Exception e) {
                            System.out.println("Opção Invalída!");
                            valorTotal = leia.nextLong();
                        }

                        break;
                }
                break;
            case 5:
                calculoImposto = new CalculoImpostosController();
                this.listaImpostos = calculoImposto.fakerCalculoImpostos(listaImpostos);
                calculoIssqn = new CalculoIssqnController();
                this.ListaCalculoIssqn = calculoIssqn.fakerCalculoIssqn(ListaCalculoIssqn);
                dadosFiscais = new DadosFiscaisController();
                this.ListaDadosFiscais = dadosFiscais.fakerDadosFiscais(ListaDadosFiscais);
                datas = new DatasController();
                this.ListaDatas = datas.fakerDatas(ListaDatas);
                emissor = new EmissorController();
                this.ListaEmissor = emissor.fakerEmissor(ListaEmissor);
                fatura = new FaturaController();
                this.ListaFatura = fatura.fakerFatura(ListaFatura);
                produtos = new ProdutosController();
                this.ListaProdutos = produtos.fakerProdutos(ListaProdutos);
                remetente = new RemetenteController();
                this.ListaRemetente = remetente.fakerRemetente(ListaRemetente);
                transporte = new TransporteController();
                this.ListaTransporte = transporte.fakerTransporte(ListaTransporte);
                valores = new ValoresController();
                this.ListaValores = valores.fakerValores(ListaValores);
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

// calculoImposto.clear();
// calculoIssqn.clear();
// dadosFiscais.clear();
// datas.clear();
// emissor.clear();
// fatura.clear();
// produtos.clear();
// remetente.clear();
// transporte.clear();
// valores.clear();
// remetentes.clear();
// faturas.clear();
// calculoImpostos.clear();
// transportes.clear();
