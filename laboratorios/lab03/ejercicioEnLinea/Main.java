import java.util.LinkedList;
class Main 
{
  public static void main(String[] args)
  {

    String a = "This_is_a_[Beiju]_text";
    String b = "[[]][][]Happy_Birthday_to_Tsinghua_University";

    System.out.println("Antes ");
    System.out.println(a);
    System.out.println(b);
    System.out.println("");

    System.out.println("Despues ");
    a = arreglo("This_is_a_[Beiju]_text");
    b = arreglo("[[]][][]Happy_Birthday_to_Tsinghua_University");

    System.out.println(a);
    System.out.println(b);

  }

  public static String arreglo(String entrada) 
  {
    LinkedList<Character> texto = new LinkedList<>();
    int cont=0;
    boolean inicio=false;
    String res="";
    
    for(int i=0; i<entrada.length();i++)
    { 
      char c=entrada.charAt(i);

      if(c=='[' && i<entrada.length()-1)
      {
        inicio=true;
        i++;
        cont=0;
      }
      else if(c==']' && i<entrada.length()-1)
      {
        inicio=false;
        i++;
      }

      if(inicio)
      {
        texto.add(cont,entrada.charAt(i));
        cont++;
      }
      else
      {
        texto.add(entrada.charAt(i));
      }
    }

    LinkedList<Character> cor = new LinkedList<>();
    cor.add('[');
    cor.add(']');
    texto.removeAll(cor); 

    for(int i=0;i<texto.size();i++)
    { 
      res+=texto.get(i);
    }
    return res;
  }
}