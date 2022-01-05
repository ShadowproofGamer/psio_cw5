public class Hotel {
    private Pokoj[] hotel;
    public Hotel(int l){
        hotel = new Pokoj[l];
        for (int i = 0;i<l;i++){
            hotel[i]=new Pokoj(i+1);
        }
    }
}
