public class Main {
    public static void main(String[] args) {
        Org model = retriveOrgFromDatabase();

        orgView view = new orgView();

        orgController controller = new orgController(model,view);

        controller.updateView();

        controller.setOrgName("Org 1");
        controller.updateView();
    }
    private static Org retriveOrgFromDatabase(){
        Org org= new Org();
        org.setName("NEW ORG");
        org.setAddress("CITY 1");
        return org;
    }
}