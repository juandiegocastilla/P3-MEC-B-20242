public class Fraccion {
    public int numerador;
    public int denominador;
    
    Fraccion(int numerador,int denominador){
    this.numerador=numerador;
    this.denominador=denominador;}
    Fraccion(double numerador,double denominador){
    double z=numerador;
    double y=denominador;}

 public void setnumerador(int numerador){
  this.numerador=numerador;}
 
 public void setdenominador(int denominador){
 this.denominador=denominador;};
  
 
 public int getnumerador(){
  return numerador;};
  public int getdenominador(){
    return denominador;};

   public static void main(String[] args) {
        Fraccion obj1=new Fraccion(1,2);
    }
  
}
