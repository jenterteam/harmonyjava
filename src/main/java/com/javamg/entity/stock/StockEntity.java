package com.javamg.entity.stock;

import com.javamg.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class StockEntity extends BaseEntity {
    private String  stockName;
    private Integer stockCount;
    private String  description;
    private String  stockAddress;
}
