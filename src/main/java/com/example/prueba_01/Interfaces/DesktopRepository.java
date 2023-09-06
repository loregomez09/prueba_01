package com.example.prueba_01.Interfaces;

import com.example.prueba_01.Model.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends JpaRepository<Desktop, Long> {

}
