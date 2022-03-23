package ar.nic.cucumber.steps;

public class Attachment {

    private final String name;

    private final String type;

    private final byte[] content;

    public Attachment(final byte[] content,final String type,final String name) {
        this.content = content;
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public byte[] getContent() {
        return content;
    }

}
