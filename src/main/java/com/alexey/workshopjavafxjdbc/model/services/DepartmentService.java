package com.alexey.workshopjavafxjdbc.model.services;

import com.alexey.workshopjavafxjdbc.model.dao.DaoFactory;
import com.alexey.workshopjavafxjdbc.model.dao.DepartmentDao;
import com.alexey.workshopjavafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    public void saveOrUpdate(Department obj){
        if(obj.getId() == null){
            departmentDao.insert(obj);
        }else{
            departmentDao.update(obj);
        }
    }
}
