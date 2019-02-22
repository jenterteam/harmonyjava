package com.javamg.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    //ORACLE START
    //@GenericGenerator(name="id" , strategy="increment")
    //@GeneratedValue(generator="id")
    //ORACLE END
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date startAddedDate;

    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartAddedDate() {
        return startAddedDate;
    }

    public void setStartAddedDate(Date startAddedDate) {
        this.startAddedDate = startAddedDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Başlangıç zamanı set etmek için başlangıç zamanı kayıtın yoksa
     * kendisi oluşturacak varsa eğer güncelleme tarihi set edecek
     */
    @PrePersist
    public void initTimeStamps() {
        if (startAddedDate == null) {
            startAddedDate = new Date();
        }
        lastUpdateDate = startAddedDate;
    }

    /**
     * Güncelleme tarihini set etmek için kullanıldı.
     */
    @PreUpdate
    public void updateTimeStamp() {
        lastUpdateDate = new Date();
    }


}
