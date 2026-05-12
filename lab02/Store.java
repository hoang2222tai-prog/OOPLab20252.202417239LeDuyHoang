public class Store{
    private DigitalVideoDisc list[]=new DigitalVideoDisc[100];
    private int count=0;

    public void add(DigitalVideoDisc d){
        list[count++]=d;
    }

    public void remove(DigitalVideoDisc d){
        for(int i=0;i<count;i++){
            if(list[i]==d){
                for(int j=i;j<count-1;j++){
                    list[j]=list[j+1];
                }
                count--;
                return;
            }
        }
    }
}
