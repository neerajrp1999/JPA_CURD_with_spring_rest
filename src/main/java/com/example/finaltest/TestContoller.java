package com.example.finaltest;

import com.example.finaltest.POJO.student;
import com.example.finaltest.Repositry.Student1Repo;
import com.example.finaltest.Repositry.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestContoller {
    @Autowired
    StudentRepo repo;

    @Autowired
    Student1Repo repo1;

    @GetMapping("/save")
    public void save(@RequestBody student s){
        System.out.println("hggfhgghghjhhj:"+s.toString());
        repo.save(s);
    }
    @GetMapping("/get/{id}")
    public student get(@PathVariable("id") int id){
        return repo.findById(id).orElse(new student());
    }
    @GetMapping("/getAll")
    public List<student> getAll(){
        return (List<student>)repo.findAll();
    }

    @GetMapping("/DeleteByID/{id}")
    public void deleteId(@PathVariable("id") int id){
        repo.deleteById(id);

    }
    @GetMapping("/DeleteALL")
    public void deleteAll(){
        repo.deleteAll();
    }
    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable("id") int id){
        return repo.existsById(id);
    }

    @GetMapping("/greater/{id}")
    public List<student> fById(@PathVariable("id") int id){
        return (List<student>)repo1.findByIdGreaterThan(id);
    }

    @GetMapping("/name/{name}")
    public List<student> fByname(@PathVariable("name") String id){
        return (List<student>)repo1.findByIdSorted(id);
    }

    @GetMapping("/updateName/{id}/{name}")
    public void updateName(@PathVariable("id") int id,@PathVariable("name") String name){
        student s= repo.findById(id).orElse(new student());
        s.setName(name);
        repo.save(s);
    }
}