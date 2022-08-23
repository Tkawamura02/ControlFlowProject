public class AsciiChars {
    
    public static void printNumbers()
  {

    System.out.println("Upper case: ");
    printUpperCase();
    System.out.println("Lower case: ");
    printLowerCase();
  }

  public static void printLowerCase()
  {
    int x = 'a';
    for (int i = 0; i < 26; i++) {
        if(i > 0) x =  x + 1;
        System.out.print(x + ", ");
    }
    System.out.println();
  }

  public static void printUpperCase()
  {
    int x = 'A';
    for (int i = 0; i < 26; i++) {
        if (i > 0)x = x+1;
        System.out.print(x + ", ");
    }
    System.out.println();
  }
    
}