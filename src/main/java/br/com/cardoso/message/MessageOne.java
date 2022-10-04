package br.com.cardoso.message;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageOne implements Message {

    @Override
    public String getMessage() {
        return "MessageOne";
    }
}
