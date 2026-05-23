class Patient {

    int id;
    String name;
    String doctor;
    String date;
    boolean appointmentBooked;

    Patient(int id, String name, String doctor, String date) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.date = date;
        this.appointmentBooked = true;
    }
}