package com.company;

public class Controller {

    private NetworkServer server;

    public Controller(){
      server  = new NetworkServer();
    }

    public void start(){
        server.startServer();
    }
}
