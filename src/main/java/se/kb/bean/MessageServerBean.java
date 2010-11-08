package se.kb.bean;

import javax.inject.Named;

@Named
public class MessageServerBean {

    public String getMessage() {
        return "Hello world! ";
    }
}
