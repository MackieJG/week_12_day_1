public class Waterbottle {

    private int volume;

    public Waterbottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }
    public int remove10FromVolume(){
        return this.volume - 10;
    }
    public int emptyVolume(){
        if(this.volume >= 0){
            return this.volume = 0;
            }
        else{
            return this.volume;
        }
    }
    public int fillVolume(){
        if(this.volume <= 100){
            return this.volume = 100;
        }
        else{
            return this.volume;
        }
    }
}
