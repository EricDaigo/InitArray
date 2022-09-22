class Main {
  public static void main(String[] args) {
    //int[] array = new int[10];
    //int[] array = {32, 27, 64, 10, 95, 14, 90, 70, 60, 37};
    final int ARRAY_LENGTH = 10; //final => declara a variavel como constante
    int[] array = new int[ARRAY_LENGTH];

    int total = 0;
    
    System.out.printf("%s%8s%n", "Index", "Value");
    //printf != println
    //printf => ultilizado quando ha estruturra de formatação %s, %d, %n, etc

    for(int counter = 0; counter < array.length; counter++){
      array[counter] = 2 + 2*counter;
      
      System.out.printf("%5d%8d%n", counter, array[counter]);

      total += array[counter];
    }

    System.out.printf("%nO valor total da soma dos elementos do array é: %d", total);
  }
}