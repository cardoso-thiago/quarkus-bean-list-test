package br.com.cardoso.configuration;

import br.com.cardoso.message.Message;
import br.com.cardoso.message.MessageImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class MessageConfiguration {

    @Inject
    Instance<Message> messages;

    @Produces
    public MessageImpl messageImpl() {
        return new MessageImpl(messages.stream().toArray(Message[]::new));
    }

}
