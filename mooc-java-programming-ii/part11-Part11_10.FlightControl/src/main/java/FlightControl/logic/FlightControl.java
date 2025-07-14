package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String id, int capacity) {
        this.airplanes.put(id, new Airplane(id, capacity));
    }

    public void addFlight(String id, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(this.airplanes.get(id), this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
