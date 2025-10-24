package airplane;

import java.security.PublicKey;

public class Airplane {
    private String flightNumber,destination,departureTime,status ="on Time";
    private int delayMinutes = 0;

public void airplane(String fn,String dest,String dt){
    flightNumber = fn;
    destination = dest;
    departureTime = dt;
}
public String checkFlightStatus(){
    return delayMinutes >0 ? "Flight " + flightNumber + " to " + destination + " delayed by " + delayMinutes + " mins. Status: " + status
                           : "Flight " + flightNumber + " to " + destination + " on time. Status: " + status;
}
public void delay(int mins){
    delayMinutes+=mins;
    status = "Delay kaayoo";
}
public String getFlightNumber(){return flightNumber;}
public String getdestination(){return destination;}
public String getdepartureTime(){return departureTime;}
public String getstatus() {return status;}
public int getdelayMinutes(){return delayMinutes;}

}
