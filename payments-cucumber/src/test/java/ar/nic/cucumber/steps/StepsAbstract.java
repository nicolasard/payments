package ar.nic.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import java.util.ArrayList;
import java.util.List;

abstract class StepsAbstract {

    private final List<Attachment> attachments = new ArrayList<Attachment>();

    @After
    public void doSomethingAfter(Scenario scenario){
        for (Attachment attachment: attachments){
            scenario.attach(attachment.getContent(), attachment.getType(), attachment.getName());
        }
    }

    public void addAttachment(byte[] content, String type, String name){
        this.addAttachment(new Attachment(content,type,name));
    }

    public void addAttachment(Attachment attachment)
    {
        this.attachments.add(attachment);
    }
}
