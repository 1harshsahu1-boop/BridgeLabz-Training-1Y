class sum15print{
    public static void main(String[] args) {
        for (int i=0;i<=10;i++) {
            for (int j=0;j<=10;j++) {
                int sum=i+j;
                if (sum==15) {	
                    System.out.println("i="+i+",j="+j+"sum="+sum);
                }
            }
        }
    }
}
