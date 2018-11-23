public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void makeCall(String message){
        mobile.makeCall(message);
    }

    public void chnageMobile(Mobile anotherMobile){
        this.mobile = anotherMobile;
    }
}
