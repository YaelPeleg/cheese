public class Main {

    public static int add(int n) {
        if(n==1){
            return 1;
        }
        return n+add(n-1);
    }

    public static void main(String[] args) {
        int i;
        for (i = 1; i < 10; i++) {
            System.out.println(add(i));
        }
    }
}
