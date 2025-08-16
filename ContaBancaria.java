public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Depósito inválido");
        }
    }

    void sacar(double valor){
        if (valor > 0  && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Saque não realizado, saldo insuficiente ou valor inválido");            
        }
    }

    void consultarSaldo(){
        System.out.printf("Saldo atual da conta %s (%s): R$%.2f\n", numeroConta, titular, saldo);
    }

}
