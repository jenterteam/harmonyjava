package com.javamg.controller;

import com.javamg.entity.stock.StockEntity;
import com.javamg.service.stock.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 10.06.2017
 */
@RestController
@RequestMapping("department")
@CrossOrigin(origins = "http://localhost:3000")
@Slf4j
public class DepartmentController {

    @Autowired
    private StockService stockService;

    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List getAllDepartment() {
        try {
            StockEntity entity = new StockEntity();
            entity.setDescription("Example Description");
            entity.setStockAddress("Example Address");
            entity.setStockCount(7);
            entity.setStockName("Example Stock Name");
            stockService.add(entity);
        } catch (Exception e) {
            log.error("Stock cannot save. Exception : {}", e);
        }
        return stockService.getAllArticles();
    }

//    @RequestMapping(value = "post", method = RequestMethod.POST)
//    public void createDepartment(Department department) {
//        departmentService.createDepartment(department);
//    }
//
//    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
//    public void updateDepartment(@PathVariable("id") Integer id) {
//        departmentService.updateDepartment(id);
//    }
//
//    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
//    public void deleteDepartment(@PathVariable("id") Integer id) {
//        departmentService.deleteDepartment(id);
//    }
}
