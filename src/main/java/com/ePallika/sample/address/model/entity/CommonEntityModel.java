package com.ePallika.sample.address.model.entity;

import com.ePallika.sample.user.model.entity.User;

import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class CommonEntityModel implements Serializable {

    @CreatedDate
    private Date entryDate;

    @CreatedBy
    private User entryBy;

    @LastModifiedDate
    private Date lastModifiedDate;

    @LastModifiedBy
    private User modifiedBy;

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public User getEntryBy() {
        return entryBy;
    }

    public void setEntryBy(User entryBy) {
        this.entryBy = entryBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public User getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(User modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

}

