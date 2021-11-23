import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    Hand hand = new Hand("D3,H5,HK");
    @Test
    void getFirstCard() {
        assertEquals("D5", hand.getFirstCard().toString());
    }
}