class Factorielle{   
    public static void main (String[] args) { 
    int i, nbEntiers=0, factorielle=1; 
    int ancien;
    String ch="1";
    String ch1="java";
    int e=-1;
    try {
    nbEntiers= Integer.parseInt(ch); 
    }
    catch(ArrayIndexOutOfBoundsException ex1){
      System.out.println("on ne peut pas convertir ce variable ");
    }
    try {
      nbEntiers= Integer.parseInt(ch1); 
      }
      catch(NumberFormatException ex2){
        System.out.println("on doit convertir un nombre");
      }
      try {
        throw new IntException();
        nbEntiers= Integer.parseInt(e); 
        }
        catch(IntException ex3){
          System.out.println(ex3.getMessage());
        }    
    for (i=2;i<= nbEntiers;i++){ 
          ancien=factorielle;
          factorielle *= i; 
      } 
     System.out.println(" Voila la factorielle des "+ nbEntiers + " premiers entiers : "+ factorielle ); 
    }
  }