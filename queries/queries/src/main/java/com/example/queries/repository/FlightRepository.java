package com.example.queries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.queries.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query(value = "SELECT * FROM FLIGHT", nativeQuery = true)
    List<Flight> retrieveAllFlights();
}
