package com.emp.demo.emp;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public void addEmp(EmpEntity e) {
        repo.save(e);
    }

    public List<EmpEntity> getAllEmp(){
        return repo.findAll();

    }

    public EmpEntity getEmpById(int id){
        Optional<EmpEntity> e= repo.findById(id);

        if(e.isPresent()){
            return e.get();
        }
        return null;
    }

    public void deleteEmp(int id){
        repo.deleteById(id);
    }
}
