package controller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Singleton Pattern
class BotToken {
    private static BotToken instance;
    private String token;

    private BotToken(String token) {
        this.token = token;
    }

    public static BotToken getInstance(String token) {
        if (instance == null) {
            instance = new BotToken(token);
        }
        return instance;
    }

    public String getToken() {
        return this.token;
    }
}

// Observer Pattern
interface MessageStatusObserver {
    void update(int statusCode, String responseMessage);
}

class MessageStatusSubject {
    private List<MessageStatusObserver> observers = new ArrayList<>();

    void registerObserver(MessageStatusObserver observer) {
        observers.add(observer);
    }

    void notifyObservers(int statusCode, String responseMessage) {
        for (MessageStatusObserver observer : observers) {
            observer.update(statusCode, responseMessage);
        }
    }
}

class MessageStatusDisplay implements MessageStatusObserver {
    public void update(int statusCode, String responseMessage) {
        if (statusCode == 200) {
            // System.out.println("Message sent successfully!");
        } else {
            System.out.println("Failed to send notification. Status code: " + statusCode);
            System.out.println("Response: " + responseMessage);
        }
    }
}

// Adapter Pattern
interface MessageSender {
    void sendMessage(String chatId, String message) throws IOException;
}

class TelegramMessageSender implements MessageSender {
    private BotToken botToken;

    TelegramMessageSender(BotToken botToken) {
        this.botToken = botToken;
    }

    public void sendMessage(String chatId, String message) throws IOException {
        String urlString = "https://api.telegram.org/bot" + botToken.getToken() + "/sendMessage";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        String payload = "{\"chat_id\": \"" + chatId + "\", \"text\": \"" + message + "\"}";

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = payload.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int statusCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();

        MessageStatusSubject subject = new MessageStatusSubject();
        subject.registerObserver(new MessageStatusDisplay());
        subject.notifyObservers(statusCode, responseMessage);
    }
}

public class Notifications_controller {

    public static void send_message(String message) throws IOException{
        BotToken botToken = BotToken.getInstance("7117892211:AAHojO2FE_vpLg_2phE_F5wvF2QHnbkFfRE");
        MessageSender sender = new TelegramMessageSender(botToken);
        sender.sendMessage("1211264412", message);
    }
   
}
