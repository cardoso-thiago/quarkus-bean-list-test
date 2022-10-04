package br.com.cardoso.message;

import java.util.StringJoiner;

public class MessageImpl {

    String finalMessage = "";

    public MessageImpl(Message... messages) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (Message message : messages) {
            stringJoiner.add(message.getMessage());
        }
        finalMessage = stringJoiner.toString();
    }

    public String getFinalMessage() {
        return finalMessage;
    }
}
