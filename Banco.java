public class Banco {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "12345";
        conta1.titular = "Camila Bomfim";
        conta1.saldo = 1000;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroConta = "67890";
        conta2.titular = "João Gabriel";
        conta2.saldo = 500;

        System.out.println("\n Operações da conta 1");
        conta1.consultarSaldo();
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.consultarSaldo();

        System.out.println("\n Operações da conta 2");
        conta2.consultarSaldo();
        conta2.depositar(100);
        conta2.sacar(700);
        conta2.consultarSaldo();
    }
    
}
