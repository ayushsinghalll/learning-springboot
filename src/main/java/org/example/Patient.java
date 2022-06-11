package org.example;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void hi(){
        System.out.println("Inside the init Method");
    }
    public void destroy(){
        System.out.println("Inside Destroy Method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
