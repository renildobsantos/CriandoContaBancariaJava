public class BancoDigital {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        cc.imprimirExtratos();
        poupanca.imprimirExtratos();

    }

}