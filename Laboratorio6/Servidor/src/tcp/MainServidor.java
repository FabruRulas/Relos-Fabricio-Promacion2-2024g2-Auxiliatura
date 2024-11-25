package tcp;

public class MainServidor {
    public static void main(String[] args) {
        SocketTcp server = new SocketTcp(3002);
        server.start();
    }
}

