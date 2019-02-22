package com.javamg.service.stock;

import com.javamg.dao.stock.StockDao;
import com.javamg.entity.stock.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StockService {
    @Autowired
    private StockDao stockDAO;

    public StockEntity getStockById(int stockId) {
        StockEntity obj = stockDAO.find(stockId);
        return obj;
    }

    public List<StockEntity> getAllArticles() {
        return stockDAO.findAll();
    }

    public boolean add(StockEntity stock) {
        stockDAO.create(stock);
        return true;
    }
}
