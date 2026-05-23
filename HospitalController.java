class HospitalController {

    Patient[] patients;
    int count;

    HospitalController(int size) {
        patients = new Patient[size];
        count = 0;
    }

    // Add Appointment
    void bookAppointment(int id, String name, String doctor, String date) {

        if (count < patients.length) {
            patients[count++] = new Patient(id, name, doctor, date);
            System.out.println("Appointment Booked Successfully");
        } else {
            System.out.println("Hospital Records Full");
        }
    }

    // Display All Patients
    Patient[] getPatients() {
        return patients;
    }

    int getCount() {
        return count;
    }

    // Search Patient
    Patient findPatient(String name) {

        for (int i = 0; i < count; i++) {

            if (patients[i].name.equalsIgnoreCase(name)) {
                return patients[i];
            }
        }

        return null;
    }

    // Cancel Appointment
    String cancelAppointment(String name) {

        Patient p = findPatient(name);

        if (p == null) {
            return "Patient Not Found";
        }

        if (p.appointmentBooked) {
            p.appointmentBooked = false;
            return "Appointment Cancelled Successfully";
        }

        return "Appointment Already Cancelled";
    }

    // Search Doctor
    void searchDoctor(String doctor) {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (patients[i].doctor.equalsIgnoreCase(doctor)) {

                System.out.println(
                        patients[i].id + " - " +
                        patients[i].name + " - " +
                        patients[i].doctor + " - " +
                        patients[i].date);

                found = true;
            }
        }

        if (!found) {
            System.out.println("Doctor Not Found");
        }
    }
}