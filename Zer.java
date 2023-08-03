import java.util.Random;
public class Zer {
    private int zer1;
    public Zer(){
        zerlerAtildi();
        System.out.println(zer1);}
    public void zerlerAtildi(){
        Random rand=new Random();
        zer1=rand.nextInt(5)+1;}
    public int Cem(Zer zer2){
        return zer1+zer2.getZer();}
    public void Max(Zer zer2){
        if(zer1>zer2.getZer()) System.out.println("1-ci zer boyukdur");
        else if(zer1<zer2.getZer()) System.out.println("2-ci zer boyukdur");
        else System.out.println("zerler beraberdir");}
    public int getZer(){
        return zer1;}
    public static void main(String[] args){
    Zer zer3=new Zer();   Zer zer4=new Zer();
    int cem=zer3.Cem(zer4);
        System.out.println(cem);  zer3.Max(zer4);}}
