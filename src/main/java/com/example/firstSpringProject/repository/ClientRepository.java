package com.example.firstSpringProject.repository;

import com.example.firstSpringProject.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
