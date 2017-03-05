package terela.com.model;// Created by tolik on 28.02.2017.

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "make")
    private String make;
    @Column (name = "id_engine")
    private Integer id_engine;
    @Column(name = "price")
    private Integer price;
    @Column(name = "date")
    private Date date;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "car_station",
            joinColumns = {@JoinColumn(name = "car_id",
                    nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "station_id",
                    nullable = false, updatable = false)})
    private Set<Station> stations = new HashSet();

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getId_engine() {
        return id_engine;
    }

    public void setId_engine(Integer id_engine) {
        this.id_engine = id_engine;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Station> getStations() {
        return stations;
    }

    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "Car{" +
                "date=" + date +
                ", price=" + price +
                ", id_engine=" + id_engine +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
