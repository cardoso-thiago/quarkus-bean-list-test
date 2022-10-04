package br.com.cardoso.message;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageTwo implements Message {

    @Override
    public String getMessage() {
        return "MessageTwo";
    }
}
