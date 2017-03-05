package terela.com.model;// Created by tolik on 28.02.2017.

import javax.persistence.*;

@Entity
@Table(name = "mechanics")
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mechanic_id")
    private Long mechanic_id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "station_id",nullable = false)
    private Station station;

    public Mechanic() {
    }

    public Long getMechanic() {
        return mechanic_id;
    }

    public void setMechanic(Long mechanic_id) {
        this.mechanic_id = mechanic_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mechanic=" + mechanic_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", station=" + station +
                '}';
    }
}
