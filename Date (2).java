public class Tarix {
    private int day;
    private int month;
    private int year;
    public Tarix(int day){
        this(day,0,2000);

    }
    public Tarix(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public Tarix(int day,int month){
        this.day=day;
        this.month=month;
        this.year=2000;
    }
    public Tarix(){
        this(0,0,2000);
    }
    public Tarix(Tarix t){
        this(t.getDay(),t.getMonth(),t.getYear());
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setYear(int year){
        if(year<0){
            throw new IllegalArgumentException("Il menfi ola bilmez!");}
        }
    public static void main(String[] args){
        Tarix tarix=new Tarix();
        Tarix day=new Tarix(1);
        Tarix tarix1=new Tarix(2,3);
        Tarix tarix2=new Tarix(tarix);
        Tarix tarix3=new Tarix(3,6,2015);
        System.out.println(tarix3.getDay()+" "+tarix2.getMonth()+" "+tarix1.getYear());
    }
}
