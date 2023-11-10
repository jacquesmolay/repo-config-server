package com.todocodeacademy.citiesservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class CityDTO {
    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;
    private List<HotelDTO> hotelList;

    public CityDTO() {
    }

    public CityDTO(Long city_id, String name, String continent, String country, String state, List<HotelDTO> hotelList) {
        this.city_id = city_id;
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.state = state;
        this.hotelList = hotelList;
    }


    public Long getCity_id() {
        return city_id;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public List<HotelDTO> getHotelList() {
        return hotelList;
    }


    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setHotelList(List<HotelDTO> hotelList) {
        this.hotelList = hotelList;
    }
}
