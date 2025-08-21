package methodChaning;

public class Tour {

    public String place;
    public String modeOfTravel;

    public String getPlace() {
        return place;
    }

    public Tour setPlace(String place) {
        this.place = place;
        return this; //return class
    }

    public String getModeOfTravel() {
        return modeOfTravel;
    }

    public Tour setModeOfTravel(String modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
        return this;
    }

    public void heyManWhereAreYouGoing(){
        System.out.println(getPlace());
        System.out.println("Oooh athal eke "+getModeOfTravel() + " eke "+ getPlace() + " yanawada");
    }

    public static void main(String[] args) {

        Tour tour = new Tour(); //tour is object and reference of the Tour class
       tour.setPlace("America").setModeOfTravel("Flight").heyManWhereAreYouGoing();

    }
}
