package isp.bad;

public class Eagle implements Bird {
    private String currentLocation;
    private Integer numberOfFeathers;

    public Eagle(String currentLocation, Integer numberOfFeathers) {
        this.currentLocation = currentLocation;
        this.numberOfFeathers = numberOfFeathers;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Integer getNumberOfFeathers() {
        return numberOfFeathers;
    }

    public void setNumberOfFeathers(Integer numberOfFeathers) {
        this.numberOfFeathers = numberOfFeathers;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() {
        this.currentLocation = "on air";
    }

    public void swim() {
        throw new UnsupportedOperationException();
    }
}
