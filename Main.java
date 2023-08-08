public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = "100100";
        contaCorrente.tipo = "Conta Corrente";

        contaCorrente.primeiroTitular = new Cliente();
        contaCorrente.primeiroTitular.cpf = "111222333444";
        contaCorrente.primeiroTitular.nome = "Vinícius";
        contaCorrente.primeiroTitular.endereco = "Avenida Rio Branco";
        contaCorrente.primeiroTitular.anoNascimento = "2000";

        contaCorrente.saldo = 1000;
        contaCorrente.limiteTotal = 3000;

        System.out.println("Bem vindo, " + contaCorrente.primeiroTitular.nome + ", o seu saldo atual é de: R$" + contaCorrente.saldo + "\n");

        contaCorrente.credito(300);
        contaCorrente.debito(700);
        contaCorrente.credito(500);
        contaCorrente.debito(800);
        contaCorrente.debito(500);

        contaCorrente.resumo();


    }
}