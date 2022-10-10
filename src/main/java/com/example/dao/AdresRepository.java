package com.example.dao;

import com.example.model.Adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdresRepository extends JpaRepository<Adres, String> {

    Adres findByName(String name);
}
