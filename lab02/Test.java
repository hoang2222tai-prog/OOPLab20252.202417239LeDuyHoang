public class Test{
    public static void swap(DigitalVideoDisc d1,DigitalVideoDisc d2){
        String tmp=d1.getTen();
        d1.setTen(d2.getTen());
        d2.setTen(tmp);
    }

    public static void main(String[] args){
        DigitalVideoDisc a=new DigitalVideoDisc("a");
        DigitalVideoDisc b=new DigitalVideoDisc("b");
        swap(a,b);
        System.out.println(a.getTen());
        System.out.println(b.getTen());
    }
}
