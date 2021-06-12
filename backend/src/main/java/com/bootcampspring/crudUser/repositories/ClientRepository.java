package com.bootcampspring.crudUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampspring.crudUser.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
