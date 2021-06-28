package repo;

import dto.ClientDTO;

public interface ClientRepo {

    void saveClient(ClientDTO clientDTO);

    ClientDTO getClient();

    void deleteClient(String name);

}
