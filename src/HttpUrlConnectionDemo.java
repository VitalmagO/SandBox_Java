import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpUrlConnectionDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://ya.ru");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            connection.setConnectTimeout(1000);

            connection.connect();

            System.out.printf("Response code: %d\n", connection.getResponseCode());
            System.out.printf("Response message: %s\n", connection.getResponseMessage());
            System.out.printf("Content type: %s\n", connection.getContentType());
            System.out.printf("Content lenght: %d\n", connection.getContentLength());

            try (InputStream inputStream = connection.getInputStream()) {
                new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                        .lines()
                        .forEach(System.out::println);
            }
        } finally {
            connection.disconnect();
        }
    }
}
