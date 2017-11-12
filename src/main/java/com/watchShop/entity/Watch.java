package com.watchShop.entity;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Oleksandr Ryzhkov on 28.10.2017.
 */
@Entity
@Table(name="watch", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
@JsonIgnoreProperties(ignoreUnknown = true, value = {"id"})
public class Watch {

    @Id //As primary key!
    @NotNull
    private long id;

    @NotNull
    private String title;

    @NotNull
    private String manufacturer;

    private boolean isDigital;

    @Enumerated(EnumType.ORDINAL)
    private Status status = Status.AVAILABLE;

    @NotNull
    private double price;

    public Watch() {
    }

    public Watch(String title, String manufacturer, boolean isDigital, Status status) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.isDigital = isDigital;
        this.status = status;
    }

    @JsonProperty("productId")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("brand")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    //@JsonIgnore
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("salePrice")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
