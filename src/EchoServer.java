import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.*;
import java.util.logging.Logger;

public class EchoServer {

    private static final Logger LOG = Logger.getLogger(EchoServer.class.getName());

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(11111)) {
            while (true) {
                try (Socket socket = serverSocket.accept()){
                    serveClient(socket);
                }
            }
        }
    }

    private static void serveClient(Socket socket) throws IOException {
        LOG.info("Serving client " + socket.getRemoteSocketAddress());

        //оборачиваем стримы с сокета в DataInputStream/DataOutputStream, для чтения примитивов и String. Так проще, ничего не нужно преобразовывать
        try (DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream())) {
            while (true) {
                //читаем строчку, одну за другой
                String request = inputStream.readUTF();

                LOG.info("Request: " + request);
                //отправляем ответ обратно клиенту
                outputStream.writeUTF("Hello. I got msg: \"" + request + "\"");
                outputStream.flush();
            }
        } catch (EOFException e) {
            //клиент закрыл подключение
        }
    }
}
