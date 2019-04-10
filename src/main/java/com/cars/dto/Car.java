package com.cars.dto;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer car_id;

    @Column(name = "model")
    private String model;

    @Column(name = "vin")
    private String vin;

    @Column(name = "days_to_finish")
    private Integer days_to_finish;

    @Column(name = "description")
    private String description;

    @Column(name = "photo_path")
    private String photo_path;

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getDays_to_finish() {
        return days_to_finish;
    }

    public void setDays_to_finish(Integer days_to_finish) {
        this.days_to_finish = days_to_finish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }
}
