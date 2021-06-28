package service;

import domain.Client;
import dto.ClientDTO;

public interface ClientService {

    Client createClient(String name);

    void deleteClient(String name);

    void editClient(String name, String newName);

    void saveClient(ClientDTO clients);

    ClientDTO loadClient();



}