public class Test {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(sum(3));
    }
    public static int sum(int N){
        if(N==1) return 1;
        return N+sum(N-1);
    }
}
