package Ejercicio_01;

import java.time.LocalDateTime;

public class Registro {
    private Integer id;
    private String first_name;
    private String last_name;
    private double latitude;
    private double longitude;
    private String domain;
    private String email;
    private String country;
    private String ip;
    private LocalDateTime last_login;

    public Registro(String country, double longitude, double latitude, String last_name, String ip, LocalDateTime last_login, Integer id, String domain, String email, String first_name) {
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.last_name = last_name;
        this.ip = ip;
        this.last_login = last_login;
        this.id = id;
        this.domain = domain;
        this.email = email;
        this.first_name = first_name;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDateTime getLast_login() {
        return last_login;
    }

    public Integer getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }

    public String getDomain() {
        return domain;
    }

    public String getCountry() {
        return country;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "coubntry='" + country + '\'' +
                ", id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", domain='" + domain + '\'' +
                ", email='" + email + '\'' +
                ", ip='" + id + '\'' +
                ", last_login=" + last_login +
                '}';
    }
}
