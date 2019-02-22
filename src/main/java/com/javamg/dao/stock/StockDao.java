package com.javamg.dao.stock;

import com.javamg.dao.BaseDao;
import com.javamg.entity.stock.StockEntity;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class StockDao extends BaseDao<StockEntity, String> {

    public List<StockEntity> loadPaginationHere(int pageNumber, int pageSize) {
        String q = "SELECT s FROM " + StockEntity.class.getName() + " s";
        return super.loadPagination(q, pageNumber, pageSize);
    }
}
