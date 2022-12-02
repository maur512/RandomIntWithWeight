public class Main {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = {5,5,5,5,1000,5,5,5,5};
Randomfromarray n = new Randomfromarray(a,b);
        int[] c = new int[10];
        int d=0;
        for (int i = 0; i < 100; i++){
             d = n.get_random();
        c[d] += 1;}
        for (int i = 0; i < 10; i++)
            System.out.println(c[i]);
    }
    }
