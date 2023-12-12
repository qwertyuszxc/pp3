public class car extends Vehicle{
    int maxSpeed;

    public car(int maxSpeed, int seats){
        super(seats);
        this.maxSpeed = maxSpeed;
    }
    public int[] spec(){
        int[] specif = {getSeats(),maxSpeed};
        return specif;
    } 

    public static void main(String[] args) {
        car myCar = new car(100, 3);
        int[] carSpec = myCar.spec();
        System.out.println(carSpec[0]+" "+carSpec[1]);
    }
}
