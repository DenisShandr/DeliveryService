package repo.impl;

import controller.ClientController;
import converter.JsonConverter;
import domain.Client;
import dto.ClientDTO;
import repo.ClientRepo;

import java.util.List;

public class ClientFileSystemRepo implements ClientRepo {

    @Override
    public void saveClient(ClientDTO clientDTO) {
        JsonConverter.objectToJsonFile(clientDTO, "Client");
    }

    @Override
    public ClientDTO getClient(){
        return (ClientDTO) JsonConverter.jsonFileToObject("Client", ClientDTO.class);
    }

    @Override
    public void deleteClient(String name) {
        List<Client> clientList = ClientController.getService().loadClient().getClients();
        clientList.removeIf(p -> p.getName().equals(name));
        saveClient(new ClientDTO(clientList));
    }


}
