public class Main {

    public static int add(int n) {
        if(n==1){
            return 1;
        }
        return n*add(n-1);
    }

    public static void main(String[] args) {
        int j;
        for (j = 1; j < 10; j++) {
            System.out.println(add(j));
        }
        System.out.println("Hello, World!");
        System.out.println("rabit");
    }
}
