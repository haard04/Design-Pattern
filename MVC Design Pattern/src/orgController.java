public class orgController {
    private Org model;
    private orgView view;
    public orgController(Org model, orgView view){
        this.model= model;
        this.view= view;
    }
    public void setOrgName(String name){
        model.setName(name);
    }
    public String getOrgName(){
        return model.getName();
    }
    public void setOrgAddress(String Address){
        model.setAddress(Address);
    }
    public String getOrgAddress(){
        return model.getAddress();
    }
    public void updateView(){
        view.printOrgDetails(model.getName(), model.getAddress());
    }
}
