package fr.mika.magasin.dto.client;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ClientDeleteDTO {
    public static final ClientDeleteDTO NULL_CLIENTDELETEDTO = new ClientDeleteDTO();

    private long clientId;

    public ClientDeleteDTO() {
        this.clientId = 0L;
    }
}
