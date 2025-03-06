class power{
    public static void main(String[] args) {
        int n=4;
        
        power(n);
    }
    public static void power(int n){
        int k=1;
        for(int i=1;i<=n;i++){
             k*=n;
        }
        System.out.println(k);
    }
}