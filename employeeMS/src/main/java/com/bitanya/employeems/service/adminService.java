package com.bitanya.employeems.service;

import com.bitanya.employeems.entity.employee;
import com.bitanya.employeems.repository.employeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

public class adminService {
    private employeeRepo repo;

    public void addEmp(employee e) {
        repo.save(e);
    }

    public List<employee> getAllEmp() {
        return repo.findAll();
    }

    public void deleteEMp(int id) {
        repo.deleteById(id);
    }


}

}
