package unidade8.exemplo2;

public class Cao extends Mamifero{
   private static final long serialVersionUID = 1L;

   @Override
   public String soar(){
       return "Faz latidos";
   }
   public Cao(String nome, int idade, String dono){
       super(nome, idade, dono, "Cão");
   }
}
