package Numbers;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
    int s = 0, r;
    int m=n;while(n>0)
    {
        r = n % 10;
        s = s + (r * r * r);
        n = n / 10;
    }if(m==s)
    {
        System.out.println("Armstrong");
    }else
    {
        System.out.println("not");
    }
    }
}
