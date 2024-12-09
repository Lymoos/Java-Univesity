import java.io.*;
import java.net.*;
import java.util.Random;

public class RandomNumberHttpServer {
    private static final int PORT = 2727;
    private static final String STUDENT_INFO = "ФИО: Максим Шестаков Игоревич, Шифр: 23И1702";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"));
        String line = in.readLine();
        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        if (method.equals("GET") && path.startsWith("/random")) {
            handleRandomNumberRequest(path, out);
        } else {
            handleNotFound(out);
        }

        out.flush();
    }

    private static void handleRandomNumberRequest(String path, BufferedWriter out) throws IOException {
        try {
            String query = path.split("\\?")[1];
            String[] params = query.split("&");
            int min = 0, max = 0;

            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue[0].equals("min")) {
                    min = Integer.parseInt(keyValue[1]);
                } else if (keyValue[0].equals("max")) {
                    max = Integer.parseInt(keyValue[1]);
                }
            }

            if (min > max) {
                sendHttpResponse(out, 400, "<html><body><h1>Error 400: Invalid range (min > max)</h1></body></html>");
                return;
            }

            Random random = new Random();
            int randomNumber = random.nextInt(max - min + 1) + min;

            sendHttpResponse(out, 200, "<html><body><h1>Random Number: " + randomNumber + "</h1><p>" + STUDENT_INFO + "</p></body></html>");
        } catch (Exception e) {
            sendHttpResponse(out, 400, "<html><body><h1>Error 400: Invalid request</h1></body></html>");
        }
    }

    private static void handleNotFound(BufferedWriter out) throws IOException {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found</h1></body></html>");
    }

    private static void sendHttpResponse(BufferedWriter out, int statusCode, String body) throws IOException {
        out.write("HTTP/1.1 " + statusCode + " OK\r\n");
        out.write("Content-Type: text/html; charset=UTF-8\r\n");
        out.write("Content-Length: " + body.getBytes("UTF-8").length + "\r\n");
        out.write("\r\n");
        out.write(body);
    }
}
