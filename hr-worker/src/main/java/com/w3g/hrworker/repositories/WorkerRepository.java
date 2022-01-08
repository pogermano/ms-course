package com.w3g.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w3g.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
