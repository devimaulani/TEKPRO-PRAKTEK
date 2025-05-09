package com.pertemuan9;

public class BusinessFlight extends Flight {
    
    public BusinessFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip()) {
            return passengers.add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false; // VIP passengers cannot be removed from business flights
    }
} 


        
       