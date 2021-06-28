import controller.ClientController;
import domain.Client;
import dto.ClientDTO;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static List<Client> clients = new ArrayList<>();

    public static void main(String[] args) throws JSONException {
        Client client = ClientController.getService().createClient("Sam");
        Client client1 = ClientController.getService().createClient("Samanta");
        Client client2 = ClientController.getService().createClient("Anna");
        Client client3 = ClientController.getService().createClient("Max");
        Client client4 = ClientController.getService().createClient("Alex");
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);

        ClientDTO clientDTO = new ClientDTO(clients);

        ClientController.getService().saveClient(clientDTO);
        print(clientDTO.getClients());

        clientDTO = ClientController.getService().loadClient();
        print(clientDTO.getClients());

        ClientController.getService().deleteClient("Sam");
        clientDTO = ClientController.getService().loadClient();
        print(clientDTO.getClients());

        ClientController.getService().editClient("Anna", "Aira");
        clientDTO = ClientController.getService().loadClient();
        print(clientDTO.getClients());







    }










    public static void print(List<Client> clients){
        clients.forEach(c -> System.out.print(c.getName() + " "));
        System.out.println();
    }

}
