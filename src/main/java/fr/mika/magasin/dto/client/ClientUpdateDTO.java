package fr.mika.magasin.dto.client;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ClientUpdateDTO {
    public static final ClientUpdateDTO NULL_CLIENTUPDATEDTO = new ClientUpdateDTO();

    private long clientId;
    private String firstname;
    private String lastname;

    public ClientUpdateDTO() {
        this.clientId = 0L;
        this.firstname = "";
        this.lastname = "";
    }
}
