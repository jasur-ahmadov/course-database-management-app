package az.orient.course.model;

import java.util.Date;

public class Lesson extends CourseModel {

    private String name;
    private Date time;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" + "name=" + name + ", time=" + time + ", price=" + price + '}';
    }
}