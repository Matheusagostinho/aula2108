
public class Pessoa {

    String nome;
    double peso;
    double altura;
    
    
  double calcularIMC(){
      return peso / (altura * altura);
  }
}
