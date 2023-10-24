import java.util.ArrayList;

public class Flights {

    ArrayList<Passengers> passenger;

    private String destination;
    private int flightId;

    public Flights(String destination, int flightId){
        this.destination = destination;
        this.flightId = flightId;
        this.passenger = new ArrayList<>();
    }


    public ArrayList<Passengers> getPassengers() {
        return passenger;
    }

    public void setPassengers(ArrayList<Passengers> passengers) {
        this.passenger = passengers;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    ///////////////Methods////////////

    public void addPassengers(Passengers passengers){
        this.passenger.add(passengers);
    }

    public int countPassengers(){
        return this.passenger.size();
    }

    public void removePassengers(Passengers passengers){
        this.passenger.remove(passengers);
    }

}



