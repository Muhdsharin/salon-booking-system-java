package saloonbooking;

public class Appointment {

    private Customer customer;
    private Service service;
    private String date;
    private String time;

    public Appointment(Customer customer, Service service, String date, String time) {
        this.customer = customer;
        this.service = service;
        this.date = date;
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Service getService() {
        return service;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}