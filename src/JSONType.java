public class JSONType {
    String to, from, heading, body;

    public JSONType(String to, String from, String heading, String body) {
        this.to = to;
        this.from = from;
        this.heading = heading;
        this.body = body;
    }

    public JSONType() {
    }

    public void loadJSONData()
    {
        System.out.println("JSON FORMAT");
        System.out.println("{");
        System.out.println("\tto: "+to + ";");
        System.out.println("\tfrom: "+from+ ";");
        System.out.println("\theading: "+heading+ ";");
        System.out.println("\tbody: "+body+ ";\n}");

    }
}
