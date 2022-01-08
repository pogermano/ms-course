package com.w3g.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.w3g.hrworker.entities.Worker;
import com.w3g.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value ="/workers")
public class WorkerResource {
	
    @Autowired
	private WorkerRepository repository;
    
    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
    	List<Worker> list =repository.findAll();    	
		return ResponseEntity.ok(list);
    	
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) {
    	Optional<Worker> worker =repository.findById(id);    	
		return ResponseEntity.ok(worker);
    	
    }

}
