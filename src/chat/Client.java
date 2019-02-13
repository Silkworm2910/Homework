package chat;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.io.Reader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private IOConnection ioConnection;
    private Scanner in = new Scanner(System.in);

    public Client(IOConnection ioConnection) {
        this.ioConnection = ioConnection;
    }

    public void start() throws IOException {
        System.out.println("Enter your name");
        String name = in.nextLine();
        Message reg = new Message(name, "is joined");
        ioConnection.send(reg);

        Thread reader = new Thread(new Reader(ioConnection));
        reader.start();

        System.out.println("Enter message");

        while (true) {
            String msg = in.nextLine();

           // реализовать возм-ть выхода(/exit)
            // реализовать возм-ть сменить имя пользователя (/nick)

            if (msg != null && !msg.isEmpty()) {
                Message message = new Message(name, msg);
                ioConnection.send(message);
            }
        }

    }

    private class Reader implements Runnable {
        private final IOConnection connection;

        private Reader(IOConnection connection) {
            this.connection = connection;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                Message message = null;
                try {
                    message = connection.recieve();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println(message);
            }
        }
    }

        public static void main(String[] args) throws IOException {
            Client client = new Client(new IOConnection(new Socket("127.0.0.1",8080)));
            client.start();
        }

}
