class Main{
  private static int nFilas = 0;
  private static int nColumnas = 0;

  public static void main(String[] args) {

      int dataSize = 1024 * 1024;
      Runtime runtime = Runtime.getRuntime();


      LeerDatos1 lectura = new LeerDatos1();
      int C = lectura.numColumnas(nColumnas);
      int F = lectura.numFilas(nFilas);


      System.out.println(C);
      System.out.println(F);

      String matrizDatos[][] = new String[F][C];
      lectura.leerArchivo(matrizDatos,F,C);
      System.out.println(matrizDatos[0][0]);

      System.out.println("memoria usada"+ (runtime.totalMemory() - runtime.freeMemory())/dataSize + "MB");


/*
      DataReader leer = new DataReader();
      leer.read("4_train_balanced_135000.csv");
      System.out.println("memoria usada"+ (runtime.totalMemory() - runtime.freeMemory())/dataSize + "MB");

*/
      /*LeerDatos lectura2 = new LeerDatos();
      lectura.LeerDatos();
      System.out.println("memoria usada"+ (runtime.totalMemory() - runtime.freeMemory())/dataSize + "MB");
      */

  }
}
