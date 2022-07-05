package com.huseyingurel.repository;

import com.huseyingurel.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location,Long> {
}
