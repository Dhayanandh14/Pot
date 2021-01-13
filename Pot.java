import java.util.*;

class Pot{
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int tot=0;
      int n=kbd.nextInt();
      for(int i=0;i<n;i++){
        int p = kbd.nextInt();
        int last = p%10;
        int remind = p/10;
        int calculate =  (int) Math. pow(remind,last);
        tot =tot+calculate;
      }   
      System.out.print(tot);
    
    kbd.close();
  }
}
