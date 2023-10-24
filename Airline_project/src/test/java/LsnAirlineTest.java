import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LsnAirlineTest {

    LsnAirline lsnAirline;
    Passengers passengers;
    Flights flights;

    @BeforeEach
    public void setUp(){
        lsnAirline = new LsnAirline();
    }

    @Test
    public void canBookFlights(){
        Flights flights = new Flights("Dubai", 850);
        Passengers passengers = new Passengers("Julia", "London", 7849, 3);
        flights.addPassengers(passengers);
        assertThat(flights.passenger.size()).isEqualTo(1);
    }

}
