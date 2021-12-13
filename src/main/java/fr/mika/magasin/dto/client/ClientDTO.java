package fr.mika.magasin.dto.client;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ClientDTO {
    public static final ClientDTO NULL_CLIENTDTO = new ClientDTO();

    private long clientId;
    private String firstname;
    private String lastname;

    public ClientDTO() {
        this.clientId = 0L;
        this.firstname = "";
        this.lastname = "";
    }
}
