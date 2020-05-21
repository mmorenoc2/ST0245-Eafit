import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LeerDatos1{

  public int numColumnas(int nColumnas){
    //0_test_balanced_5000.csv
    Path filePath = Paths.get("0_test_balanced_5000.csv");
    try{
      BufferedReader br = Files.newBufferedReader(filePath);
      String primeraLinea = br.readLine();
      String[] datosDeLinea = primeraLinea.split(";");
      nColumnas = datosDeLinea.length;

    }catch(IOException e){
      e.printStackTrace();
    }
    return nColumnas;
  }

  public int numFilas(int nFilas){
    Path filePath = Paths.get("0_test_balanced_5000.csv");
    try {
      BufferedReader br = Files.newBufferedReader(filePath);
      String linea;
      while((linea = br.readLine()) !=null){
          nFilas++;
      }
    }catch (IOException e){
        e.printStackTrace();
    }
    return nFilas;
  }

  public String[][] leerArchivo(String[][] matrizDatos,int nFilas,int nColumnas){
    //LinkedList<String> datos = new LinkedList<String>()
    Path filePath = Paths.get("0_test_balanced_5000.csv");
    try {
      BufferedReader br = Files.newBufferedReader(filePath);
      String linea;
      while((linea = br.readLine()) != null){
        String[] contenido = linea.split(";");

        //System.out.println(contenido[0]);
        for(int i = 0; i < nFilas; i++){
          for(int j = 0; j < nColumnas; j++){
            matrizDatos[i][j] = contenido[j];
          }
        }
      }

    }catch (IOException e){
        e.printStackTrace();
    }

    return matrizDatos;
  }

}
