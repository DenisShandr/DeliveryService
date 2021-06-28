package domain;

import java.io.Serializable;

public class Client implements Serializable {

    private String name;
    static final long serialVersionUID = 43842435752L;

    public Client(String name) {
        this.name = name;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
