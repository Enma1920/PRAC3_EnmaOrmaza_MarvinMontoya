package airports;

import airports.exceptions.FlightScheduleException;
import flyingObjects.Aircraft;

import java.util.Date;

public class Flight implements ScheduledTravel{
    /*TODO: Ensure that flight implements interface ScheduledTravel*/

    private String id;
    private String origin;
    private String destination;
    private Aircraft aircraft;
    private Date departure;
    private Date arrival;


    /**
     * Creates a flight with the given parameters. Throws the following exceptions:
     * - IllegalArgumentException if id is null
     * - IllegalArgumentException if aircraft is null
     * - FlightScheduleException if either departure or arrival (or both) are null
     * - FlightScheduleException if either origin or destination (or both) are null
     * - FlightScheduleException if departure date is later than or equal to arrival date
     * Ensure that the exceptions include a relevant message informing of the error
     * @param id
     * @param aircraft
     * @param origin
     * @param destination
     * @param departure
     * @param arrival
     */
    public Flight(String id, Aircraft aircraft, String origin, String destination, Date departure, Date arrival){
        /*COMPLETE*/
        if(id == null) throw new IllegalArgumentException("The id is NULL");
        if(aircraft == null) throw new IllegalArgumentException("The Aircraft is NULL");
        if(departure == null || arrival == null) throw new FlightScheduleException("Departure is NULL or arrival is NULL");
        if(origin == null || destination == null) throw new FlightScheduleException("Origin or destination are NULL (or both)");
        if(departure.getTime() >= arrival.getTime()) throw new FlightScheduleException("Departure date is greater or equal to arrival date");
    }

    /*COMPLETE*/

    /**
     * Two flights are equal if their id is the same (case insensitive).
     * @param o
     * @return true if both flights have the same id, false otherwise
     */
    @Override
    public boolean equals(Object o){
        /*COMPLETE*/
        //Change as appropriate
        return o.equals(id);
    }


    @Override
    public Date getDepartureTime() {
        return null;
    }

    @Override
    public Date getArrivalTime() {
        return null;
    }
}


