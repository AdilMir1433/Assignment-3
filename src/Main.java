public class Main {
    public static void main(String[] args) {

        DBInterface typeXML = new XMLType("Ayub", "Adil", "Training", "I'm currently doing my training");
        typeXML.loadData();


        DBInterface db = new Adapter(new JSONType("Ayub", "Adil", "Training", "I'm currently doing my training"));
        db.loadData();
    }
}