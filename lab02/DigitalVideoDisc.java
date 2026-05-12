public class DigitalVideoDisc{
    private String ten;
    private String theloai;
    private String daodien;
    private int thoiluong;
    private float gia;
    private static int dem=0;
    private int id;

    public DigitalVideoDisc(String ten){
        this.ten=ten;
        dem++;
        this.id=dem;
    }

    public DigitalVideoDisc(String ten,String theloai,float gia){
        this.ten=ten;
        this.theloai=theloai;
        this.gia=gia;
        dem++;
        this.id=dem;
    }

    public DigitalVideoDisc(String ten,String theloai,String daodien,float gia){
        this.ten=ten;
        this.theloai=theloai;
        this.daodien=daodien;
        this.gia=gia;
        dem++;
        this.id=dem;
    }

    public DigitalVideoDisc(String ten,String theloai,String daodien,int thoiluong,float gia){
        this.ten=ten;
        this.theloai=theloai;
        this.daodien=daodien;
        this.thoiluong=thoiluong;
        this.gia=gia;
        dem++;
        this.id=dem;
    }

    public float getGia(){
        return gia;
    }

    public String getTen(){
        return ten;
    }

    public void setTen(String ten){
        this.ten=ten;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return id+" "+ten+" "+theloai+" "+gia;
    }
}
