package com.example.springprofile.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    void deleteVehicleById(Long id);
}
