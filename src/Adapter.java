public class Adapter implements DBInterface{

    private final String to, from, heading, body;
    private final JSONType adaptee;

    public Adapter(JSONType adaptee) {
        this.adaptee = adaptee;
        this.to = adaptee.to;
        this.from = adaptee.from;
        this.heading = adaptee.heading;
        this.body = adaptee.body;
    }

    @Override
    public void loadData()
    {
        adaptee.loadJSONData();
    }
}
