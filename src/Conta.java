
public class Conta {
    
    double saldo;
    String agencia;
    String numero;
    String titular;
    
    void depositar(double valor){
        this.saldo += valor;
    }
   
    boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
                
   
    }
    
}

