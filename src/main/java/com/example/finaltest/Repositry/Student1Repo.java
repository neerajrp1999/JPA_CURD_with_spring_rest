package com.example.finaltest.Repositry;

import com.example.finaltest.POJO.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Student1Repo extends JpaRepository<student,Integer> {
    public List<student> findByIdGreaterThan(int id);
    public List<student> findByName(String name);

    @Query("from student where name=name order by id desc")
    public List<student> findByIdSorted(String name);
}
