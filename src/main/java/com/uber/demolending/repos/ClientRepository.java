package com.uber.demolending.repos;

import org.springframework.data.repository.CrudRepository;

import com.uber.demolending.models.Client;


public interface ClientRepository extends CrudRepository <Client, Long> {

}
