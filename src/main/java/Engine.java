import behaviours.Icomponent;

public class Engine implements Icomponent {

    private int hp;
    private boolean status;

    public Engine(int hp, boolean status){
        this.hp = hp;
        this.status = status;
    }

    private void changeStatus(){

        status = !status;
    }

    public void operate(){
        this.changeStatus();
    }

    public int gethp() {
        return this.hp;
    }

    public boolean getStatus() {
        return this.status;
    }


}
