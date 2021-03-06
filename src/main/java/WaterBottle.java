public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    //Getters
    public int getVolume() {
        return this.volume;
    }

    //Methods
    public void drink() {
        this.volume -= 10;
    }

    public void empty() {
        this.volume -= 100;
    }

    public void fill() {
        this.volume += 100;
    }

}
