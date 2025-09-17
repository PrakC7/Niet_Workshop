interface MountainParts {
    String TERRAIN = "off-road";
    void setSuspension(String newValue);
    String getSuspension();
    void setType(String newValue);
    String getType();
}
class Bike implements MountainParts {
    private String suspension;
    private String type;
    public void setSuspension(String newValue) {
        suspension = newValue;
    }
    public String getSuspension() {
        return suspension;
    }
    public void setType(String newValue) {
        type = newValue;
    }
    public String getType() {
        return type;
    }
}
public class Main18 {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.setSuspension("Full");
        obj.setType("Mountain Bike");
        System.out.println("Terrain: " + MountainParts.TERRAIN);
        System.out.println("Suspension: " + obj.getSuspension());
        System.out.println("Type: " + obj.getType());
    }
}