// [ok] Crie uma Classe chamada ContaCorrente que possua:
// [ok] Uma variável de ponto flutuante juros que indique a porcentagem do rendimento da conta. Defina o valor inicial em 0,01;
// [ok] Uma variável de ponto flutuante que indique o saldo;
// [ok] Um método depósito;
// [ok] Uma variável chamada limiteChequeEspecial em ponto flutuante, iniciada com o valor -200;
// [ok] Um método saque, que verifica se o saque pode ser realizado de acordo com o saldo atual e o limiteChequeEspecial. Caso não tenha mais limite, escrever no console "Limite insuficiente!";
// [ok] Um método rendimento que usa o valor do juros para fazer o saldo crescer caso o saldo não seja negativo;
// [ok] Um método para exibir o saldo;
// [ok] Uma variável de texto para o primeiro nome do cliente;
// [ok] Uma variável de texto para o sobrenome do cliente; 
// [ok] Método getNome que retorne o nome do cliente completo;
// [ok] Uma variável para o número da conta corrente (do tipo primitivo long);
// [ok] Método getNumero que dê como resultado o número da conta do cliente;
// [ok] Método main, com uma instância da classe ContaCorrente e faça um depósito de R$100, um saque de R$125, execute a função rendimento e imprimir o saldo;
// [ok] Use o modificador de acesso “public” para todos os métodos e nenhum modificador (“package private”) para os atributos da classe.

public class contaCorrente{
    public double juros = 0.01;
    public float saldo;
    public float limiteChequeEspecial = -200;
    public float deposito;
    public String nome;
    public String sobrenome;
    public long numeroConta;

    // set
    public void setDeposito(float deposito){
        this.deposito = deposito;
        saldo += deposito;
    }

    // metodos
    public void rendimento(){
        if(saldo>0){
            saldo += saldo*juros;
        }
    }

    public void saque(float saque){
        if(saldo > saque || limiteChequeEspecial > saque){
            saldo -= saque;
            System.out.println("Saque efetuado!");
        } else {
            System.out.println("Saque não pode ser efetuado, valor maior do que o valor em conta");
        }
    }

    public void showSaldo(){
        System.out.println("Saldo: R$" + saldo);
    }


    // get 
    public String getNome(){
        return this.nome + this.sobrenome;
    }

    public long getNumero(){
        return this.numeroConta;
    }

    public static void main(String[] args){
        contaCorrente conta1 = new contaCorrente();
    
        conta1.setDeposito(100);
        conta1.saque(25);
        conta1.rendimento();
    
        conta1.showSaldo();;
    }

}