import java.util.LinkedList;

class PB42Simu {

   public static void main(String[] dummy) {
      System.out.println("step1:");
      var LL1= new LinkedList<Integer>();
      for(int i=10; i<=18; i++) {
         LL1.add(i); 
      }     
      System.out.println(LL1);

      System.out.println("step2:");
      var itr= LL1.listIterator();
      while(itr.nextIndex()<4) {
         Integer x= itr.next();
         itr.set(x+10);
      } 
      System.out.println(LL1);

      System.out.println("step3:");
      while(itr.hasNext()) {
         Integer x= itr.next();
         if(x%2==0) {  itr.add(x+10);  }   
      }
      System.out.println(LL1);

      System.out.println("step4:");
      while(itr.hasPrevious()) {
         Integer x= itr.previous();
         if(x>=22) itr.remove();
      }
      System.out.println(LL1);

   }

/*
step1:
[10, 11, 12, 13, 14, 15, 16, 17, 18]
step2:
[20, 21, 22, 23, 14, 15, 16, 17, 18]
step3:
[20, 21, 22, 23, 14, 24, 15, 16, 26, 17, 18, 28]
step4:
[20, 21, 14, 15, 16, 17, 18]
*/

}
