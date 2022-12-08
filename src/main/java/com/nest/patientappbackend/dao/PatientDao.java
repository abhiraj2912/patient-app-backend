package com.nest.patientappbackend.dao;

import com.nest.patientappbackend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `address`, `appo_date`, `dob`, `doc_name`, `email`, `gender`, `name`, `phone` FROM `patients` WHERE `name` = :name",nativeQuery = true)
    List<Patient> SearchPatient(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id` = :id",nativeQuery = true)
    void DeletePatient(@Param("id") Integer id);
}
