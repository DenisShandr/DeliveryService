package controller;

import service.ClientService;
import service.impl.ClientServiceImpl;

public class ClientController {

    private static ClientService clientService;

    public static ClientService getService() {
        if (clientService == null) {
            clientService = new ClientServiceImpl();
        }
        return clientService;
    }

}
