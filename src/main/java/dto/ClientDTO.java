package dto;

import domain.Client;

import java.util.List;

public class ClientDTO {

    private List<Client> clients;

    public ClientDTO(List<Client> clients) {
        this.clients = clients;
    }

    public ClientDTO() {
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
