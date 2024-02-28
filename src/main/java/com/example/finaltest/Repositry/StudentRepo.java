package com.example.finaltest.Repositry;

import com.example.finaltest.POJO.student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<student, Integer> {
}
