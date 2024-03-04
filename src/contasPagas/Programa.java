package contasPagas;

public class Programa {

    public static void main(String[] args) {

        // Testando o programa Contas Pagas
        Produto p1 = new Produto("Smartphone", 1500.00);
        Produto p2 = new Produto("Notebook", 3000.00);

        Cliente c1 = new Cliente("João Silva", "123.456.789-00");
        Cliente c2 = new Cliente("Maria Oliveira", "987.654.321-00");

        Conta conta1 = new Conta(1, "2024-03-10", "2024-03-08", p1, c1);
        Conta conta2 = new Conta(2, "2024-03-15", "2024-03-12", p2, c2);

        conta1.visualizarConta();
        System.out.println();
        conta2.visualizarConta();

    }
}
