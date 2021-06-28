package service.impl;

import domain.Client;
import dto.ClientDTO;
import repo.ClientRepo;
import repo.impl.ClientFileSystemRepo;
import service.ClientService;

import java.util.List;


    public class ClientServiceImpl implements ClientService {

        private static ClientRepo repo = new ClientFileSystemRepo();

        @Override
        public Client createClient(String name) {
            return new Client(name);
        }

        @Override
        public void deleteClient(String name) {
            repo.deleteClient(name);
        }


        @Override
        public void editClient(String name, String newName) {
            List<Client> clients = repo.getClient().getClients();
            for (int i = 0; i < clients.size(); i++){
                if (clients.get(i).getName().equals(name)){
                    clients.set(i,new Client(newName));
                }
            }
            repo.saveClient(new ClientDTO(clients));
        }

        @Override
        public void saveClient(ClientDTO clients) {
            repo.saveClient(clients);
        }

        @Override
        public ClientDTO loadClient() {
            return repo.getClient();
        }



    }