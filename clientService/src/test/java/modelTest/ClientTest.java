package modelTest;

import com.remskis.employeemanagement.clientService.clientService.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

;

public class ClientTest {

    @Test
    public void testGettersAndSettersSuccess() {
        Client client = Client.builder()
                .id(1L)
                .name("Janis Davis")
                .email("janis.davis@internet.com")
                .contactNumber("123-456-7890")
                .company("Umbrella Corp.")
                .build();

        Assertions.assertEquals(1L, client.getId());
        Assertions.assertEquals("Janis Davis", client.getName());
        Assertions.assertEquals("janis.davis@internet.com", client.getEmail());
        Assertions.assertEquals("123-456-7890", client.getContactNumber());
        Assertions.assertEquals("Umbrella Corp.", client.getCompany());

    }

    @Test
    public void testGettersAndSettersFail(){
        Client client = Client.builder()
                .id(1L)
                .name("Kronvalds Davis")
                .email("davis.davis@internet.com")
                .contactNumber("321-456-7890")
                .company("Umbrellla Corp.")
                .build();

        Assertions.assertNotEquals(25L, client.getId());
        Assertions.assertNotEquals("Janis Davis", client.getName());
        Assertions.assertNotEquals("janis.davis@internet.com", client.getEmail());
        Assertions.assertNotEquals("123-456-7890", client.getContactNumber());
        Assertions.assertNotEquals("Umbrella Corp.", client.getCompany());
    }


}
