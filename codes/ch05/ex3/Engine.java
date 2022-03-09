public class Engine {
    private String type;
    private int horsePower;

    Engine(String type, int horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }
    public String getType(){
        return type;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Engine has started!");
    }

    public void stop() {
        System.out.println("Engine has stopped!");
    }
}