public class Car2
{
    private String name;
    private Engine engine;

    public Car2(String name, Engine engine){
        this.name = name;
        this.engine = engine;
    }
    public String getName(){
        return name;
    }
    public Engine getEngine(){
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}