package rentcar.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import java.util.Date;

@Entity
@Table(name = "rental")
public class Rental implements DataModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "rent_date")
    private Date rentDate;

    @Column(name = "return_date")
    private Date returnDate;

    public Rental(){
    }

    public Rental(int id, Car car, User user, Date rentDate, Date returnDate) {
        this.id = id;
        this.car = car;
        this.user = user;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}