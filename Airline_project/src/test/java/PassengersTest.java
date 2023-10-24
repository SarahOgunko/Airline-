import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengersTest {

    Passengers passengers;


    @BeforeEach
    void setUp(){
        passengers = new Passengers("Nathan", "Birmingham", 447873183, 1);

    }

    @Test
    void  canGetName(){
        assertThat(passengers.getName()).isEqualTo("Nathan");
    }

    @Test
    void canGetAddress(){
        assertThat(passengers.getAddress()).isEqualTo("Birmingham");
    }



}
