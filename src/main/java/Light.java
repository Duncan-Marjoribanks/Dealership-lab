import behaviours.Icomponent;

public class Light implements Icomponent {

    private String type;
    private String status;

    public Light(String type, String status) {
        this.type = type;
        this.status = status;
    }


    public void operate() {
        this.changeStatus();
    }

    public String getStatus() {
        return this.status;
    }

    private void changeStatus() {
        if (this.getStatus() == "Lights are off") {
            this.status = "Lights are on";
        } else {
            this.status = "Lights are off";
        }
    }

}
