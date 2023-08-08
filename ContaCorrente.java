public class ContaCorrente {
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    void credito(double valor) {
        this.saldo += valor;
        System.out.println("Realizando um depósito no valor de: R$" + valor + "\nO saldo agora é de: R$" + this.saldo + "\n");
    }

    void debito(double valor) {
        this.saldo -= valor;
        System.out.println("Realizando um saque no valor de: R$" + valor + "\nO saldo agora é de: R$" + this.saldo + "\n");
    }

    boolean estaDevedor() {
        return this.saldo < 0;
    }

    void resumo() {
        System.out.println("Número da conta corrente: " + this.numero +
                "\nNome do primeiro titular: " + this.primeiroTitular.nome);

        if (segundoTitular != null) {
            System.out.println("Nome do segundo titular: " + this.segundoTitular.nome);
        }

        System.out.println("Saldo atual: " + this.saldo +
                "\nLimite atual: " + (this.limiteTotal + this.saldo) +
                "\nLimite total: " + this.limiteTotal);

        if (estaDevedor()) {
            System.out.println("Procure o seu gerente!");
        }

    }
}
