public class Android extends Mobile {
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeCall(String message){
        if (message.length() > 30){
            String errorMsg = String.format("<%s>Message cannot be sent.", this.getClass().getName());
            System.out.println(errorMsg);
        }else {
            String input = String.format("<%s>Message : %s", this.getClass().getName(), message);
            System.out.println(input);
        }
    }
}
