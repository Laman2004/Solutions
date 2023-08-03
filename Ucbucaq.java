public class Ucbucaq {
    int oturacaq;
    int hundurluq;
    int teref1;
    int teref2;
    public double Sahe(int oturacaq,int hundurluq){
        double sahe;
        return sahe=oturacaq*hundurluq/2;
    }
    public double Sahe(int oturacaq,int teref1,int teref2){
        double sahe;
        double p=(oturacaq+teref1+teref2)/2;
        return sahe=Math.sqrt((p-oturacaq)*(p-teref1)*(p-teref2));
    }
    public static void main(String[] args){
        Ucbucaq ucbucaq=new Ucbucaq();
        System.out.println(ucbucaq.Sahe(20,10));
        System.out.println(ucbucaq.Sahe(20,10,15));
    }
}
