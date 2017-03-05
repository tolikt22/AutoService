package terela.com.model;// Created by tolik on 28.02.2017.

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "stations")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "station_id")
    private Long station_id;
    @Column(name = "address")
    private String address;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "stations")
    private Set<Car> cars = new HashSet();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "station")
    private Set<Mechanic> mechanics = new HashSet<Mechanic>();

    public Station() {
    }

    public Long getStation_id() {
        return station_id;
    }

    public void setStation_id(Long station_id) {
        this.station_id = station_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Station{" +
                "station_id=" + station_id +
                ", address='" + address + '\'' +
                '}';
    }
}
