public class Car1
{
    private final String name;
    private final Engine engine; // Composition.

    public Car1(String name, String engineType, int enginePower){
        Engine engine = new Engine(engineType, enginePower);
        this.name = name;
        this.engine = engine;
    }
    public String getName(){
        return name;
    }
    public Engine getEngine(){
        return engine;
    }
    public void move(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
}