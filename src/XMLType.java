public class XMLType implements DBInterface{
    private String to, from, heading, body;

    public XMLType(String to, String from, String heading, String body) {
        this.to = to;
        this.from = from;
        this.heading = heading;
        this.body = body;
    }

    @Override
    public void loadData() {
        System.out.println("XML FORMAT");
        System.out.println("<note>\n\t<to>"+to+"</to>\n\t<from>"+from+"</from>\n\t<heading>"+heading+"</heading>\n\t<body>"+body+"</body>\n<note>");
    }
}
