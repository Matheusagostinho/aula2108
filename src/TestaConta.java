
public class TestaConta {

    
    public static void main(String[] args){
        
        Conta conta1 = new Conta();
        
        conta1.saldo = 2500;
        conta1.numero = "007";
        conta1.agencia = "9";
        conta1.titular = "Matheus";
        
        conta1.depositar(5000.0);
        
        System.out.println("Saldo: " + conta1.saldo);
        
        if(conta1.sacar(800))
            System.out.println("Saque Efetuado com Sucesso" );
        else
            System.out.println("Falha no Saque");
        
        
        System.out.println("Saldo: " + conta1.saldo);
    }
    
}
