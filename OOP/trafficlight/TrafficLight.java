package trafficlight;

public class TrafficLight {
    String color;
    int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) { color = newColor; }
    public boolean isGreen() { return color.equalsIgnoreCase("green"); }
}