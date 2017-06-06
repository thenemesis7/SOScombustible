package com.example.micha.soscombustible;

/**
 * Created by micha on 15-05-2017.
 */

public class Bencinera {
    private int id;
    private String nombre;
    private String direccion;
    private int region;
    private String comuna;
    private int logo;




    public Bencinera(int code, String name, String address, int logo){
        this.setId(code);
        this.setNombre(name);
        this.setDireccion(address);
        this.setLogo(logo);
        this.setRegion(13);
        this.setComuna("Santiago");

    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

}
