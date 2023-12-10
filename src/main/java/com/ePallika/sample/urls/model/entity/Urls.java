package com.ePallika.sample.urls.model.entity;

import com.ePallika.sample.address.model.entity.Municipality;
import jakarta.persistence.*;

@Entity
public class Urls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "municipality_id", referencedColumnName = "id"),
            @JoinColumn(name = "district_id", referencedColumnName = "district_id"),
            @JoinColumn(name = "province_id", referencedColumnName = "province_id")
    })
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Municipality municipality;

    private String url;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }
}
