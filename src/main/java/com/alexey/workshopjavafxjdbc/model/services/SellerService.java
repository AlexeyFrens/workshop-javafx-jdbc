package com.alexey.workshopjavafxjdbc.model.services;

import com.alexey.workshopjavafxjdbc.model.dao.DaoFactory;
import com.alexey.workshopjavafxjdbc.model.dao.SellerDao;
import com.alexey.workshopjavafxjdbc.model.entities.Seller;

import java.util.List;

public class SellerService {

    private SellerDao SellerDao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return SellerDao.findAll();
    }

    public void saveOrUpdate(Seller obj){
        if(obj.getId() == null){
            SellerDao.insert(obj);
        }else{
            SellerDao.update(obj);
        }
    }

    public void remove(Seller Seller){
        SellerDao.deleteById(Seller.getId());
    }
}
