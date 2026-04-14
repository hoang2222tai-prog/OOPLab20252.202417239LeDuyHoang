public class Cart{
    public static final int MAX=20;
    private DigitalVideoDisc list[]=new DigitalVideoDisc[MAX];
    private int count=0;

    public void add(DigitalVideoDisc d){
        if(count<MAX){
            list[count]=d;
            count++;
            System.out.println("da them");
        }else{
            System.out.println("day roi");
        }
    }

    public void remove(DigitalVideoDisc d){
        for(int i=0;i<count;i++){
            if(list[i]==d){
                for(int j=i;j<count-1;j++){
                    list[j]=list[j+1];
                }
                count--;
                System.out.println("da xoa");
                return;
            }
        }
        System.out.println("khong thay");
    }

    public float total(){
        float tong=0;
        for(int i=0;i<count;i++){
            tong+=list[i].getGia();
        }
        return tong;
    }
}
