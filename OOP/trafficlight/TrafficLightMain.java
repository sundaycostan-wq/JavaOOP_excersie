package trafficlight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        System.out.println("Light color: " + light.color);
        light.changeColor("Green");
        System.out.println("Is it green? " + light.isGreen());
    }
}