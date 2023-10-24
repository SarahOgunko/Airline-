import java.util.ArrayList;

public class LsnAirline {

    ArrayList<Flights> flights;

    public LsnAirline() {
        this.flights = new ArrayList<>();
    }

    public void addFlights(Flights flights) {
        this.flights.add(flights);
    }

    public void removeFlights(Flights flights) {
        this.flights.remove(flights);
    }


    public void bookFlights(Flights flights, Passengers passengers) {
        flights.addPassengers(passengers);
    }

    public void cancelFlight(Flights flights, Passengers passengers) {
        flights.removePassengers(passengers);
    }

    public int countFlight() {
       return  this.flights.size();

    }
}


