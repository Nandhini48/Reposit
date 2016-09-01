public class sapmle {
    public static void main(String[] args){
          int n,a,b=0,c=0,a1,s,s1=0;
        System.out.println("enter the input number");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
          while(n!=0){
             a=n%10;
             b=b*10+a;
             n=n/10;
             c++;
          }
         
           for(int i=c;i>0;i--){
             if(b!=0){
                 a1=b%10;
                 s=a1*i;
                 s1=s+s1;
                 b=b/10;
                 
             }}
        System.out.println(" the ans is       "+s1);
        if(s1%11==0){
            System.out.println("it is an isbn number");
        }else{
            System.out.println("not an isbn number");
        }
}
}