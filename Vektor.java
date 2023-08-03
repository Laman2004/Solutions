public class Vektor {
    private float[] vektor;
    public Vektor(float[] vektor){
        this.vektor=vektor;
    }
    public float[] getVektor(){
        return vektor;
    }
    public Vektor Cem(Vektor vektor1){
        float[] cem=new float[vektor.length];
        for(int i=0;i<cem.length;i++){
            cem[i]=vektor[i]+vektor1.getVektor()[i];
        }
        return new Vektor(cem);
    }
    public static void main(String[] args){
        float [] A={5,2};
        float [] B={3,2};
    Vektor vector=new Vektor(A);
    Vektor vector1=new Vektor(B);
    Vektor v=vector.Cem(vector1);
        System.out.println(v.getVektor());
    }
}
