public class Aims{
    public static void main(String[] args){
        Cart cart=new Cart();
        DigitalVideoDisc d1=new DigitalVideoDisc("lion king","hoat hinh","disney",90,19.9f);
        DigitalVideoDisc d2=new DigitalVideoDisc("star wars","vien tuong","lucas",120,24.5f);
        DigitalVideoDisc d3=new DigitalVideoDisc("aladin","hoat hinh",18.9f);
        cart.add(d1);
        cart.add(d2);
        cart.add(d3);
        System.out.println("tong tien: "+cart.total());
    }
}
