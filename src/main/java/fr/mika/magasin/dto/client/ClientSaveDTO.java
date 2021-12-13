package fr.mika.magasin.dto.client;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ClientSaveDTO {
    public static final ClientSaveDTO NULL_CLIENTSAVEDTO = new ClientSaveDTO();

    private String firstname;
    private String lastname;

    public ClientSaveDTO() {
        this.firstname = "";
        this.lastname = "";
    }
}
