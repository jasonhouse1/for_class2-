public class until0304 {

    public static void main(String[] args) {

        System.out.println("Hello, java!");
        System.out.println("資管4"+"411631327");
        System.out.println("0225\n 0257");
       
        


    }

    //  練習1 
    public static void exercise1() {

        int[] a1 = {1,2,3,4,5};

        for(int i = 0; i < a1.length; i++){
            System.out.print(a1[i]);
        }

    }

    //  練習2 
    public static void exercise2() {

        int[] a1 = {1,2,3,4,5};
        int[] a2 = new int[a1.length];

        for(int i = 0; i < a1.length; i++){
            a2[i] = a1[i];
        }

        for(int i = 0; i < a2.length; i++){
            System.out.print(a2[i] += 5);
        }

    }

    //  練習3 
    public static void exercise3() {

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10};
        int[] a3 = new int[a1.length];

        for(int i = 0; i < a1.length; i++){
            a3[i] = a1[i] + a2[i];
        }

        for(int i = 0; i < a3.length; i++){
            System.out.print(a3[i]);
        }

    }
}
