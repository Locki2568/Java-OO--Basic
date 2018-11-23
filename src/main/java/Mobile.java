public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void makeCall(String message){
        String input = String.format("Message : %s", message);
        System.out.println(input);
    }

    public void getMobileInfo(){
        String spec = String.format("name: %s, color: %s, brand: %s", getName(),getColor(),getBrand());
        System.out.println(spec);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
