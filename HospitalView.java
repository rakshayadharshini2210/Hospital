import java.util.Scanner;

class HospitalView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println("\n--- Hospital Management System ---");

        System.out.println("1. Book Appointment");
        System.out.println("2. Display Appointments");
        System.out.println("3. Search Patient");
        System.out.println("4. Search Doctor");
        System.out.println("5. Cancel Appointment");
        System.out.println("6. Exit");
    }

    int getChoice() {

        System.out.print("Enter Choice: ");
        return sc.nextInt();
    }

    int getId() {

        System.out.print("Enter Patient ID: ");
        return sc.nextInt();
    }

    String getInput(String msg) {

        sc.nextLine();
        System.out.print(msg);
        return sc.nextLine();
    }

    // Display Patients
    void displayPatients(Patient[] patients, int count) {

        System.out.println("\n--- Appointment List ---");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    patients[i].id + " - " +
                    patients[i].name + " - " +
                    patients[i].doctor + " - " +
                    patients[i].date + " - " +
                    (patients[i].appointmentBooked ? "Booked" : "Cancelled"));
        }
    }

    void showMessage(String msg) {
        System.out.println(msg);
    }
}