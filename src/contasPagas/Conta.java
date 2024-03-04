package contasPagas;

public class Conta {

    private int idConta;
    private String dataVencimento, dataPagamento;
    private Produto pro;
    private Cliente cli;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto pro, Cliente cli) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.pro = pro;
        this.cli = cli;
    }

    public void visualizarConta() {
        System.out.println("Identificador da conta: " + idConta);
        System.out.println("Nome do produto: " + pro.getDescricaoProduto());
        System.out.println("Nome do cliente: " + cli.getNomeCliente());
        System.out.println("CPF do cliente: " + cli.getCpf());
        System.out.println("Valor do produto: R$" + pro.getValorProduto());
        System.out.println("Data do vencimento: " + dataVencimento);
        System.out.println("Data do pagamento: " + dataPagamento);
    }
}
