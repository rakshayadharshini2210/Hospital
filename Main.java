public class Main {

    public static void main(String[] args) {

        HospitalController controller = new HospitalController(10);

        HospitalView view = new HospitalView();

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    int id = view.getId();

                    String name = view.getInput("Enter Patient Name: ");

                    String doctor = view.getInput("Enter Doctor Name: ");

                    String date = view.getInput("Enter Appointment Date: ");

                    controller.bookAppointment(id, name, doctor, date);

                    break;

                case 2:

                    view.displayPatients(
                            controller.getPatients(),
                            controller.getCount());

                    break;

                case 3:

                    String searchPatient =
                            view.getInput("Enter Patient Name: ");

                    Patient p = controller.findPatient(searchPatient);

                    if (p != null) {

                        view.showMessage(
                                "Patient Found: " +
                                p.name + " - " +
                                p.doctor + " - " +
                                p.date);
                    } else {

                        view.showMessage("Patient Not Found");
                    }

                    break;

                case 4:

                    String searchDoctor =
                            view.getInput("Enter Doctor Name: ");

                    controller.searchDoctor(searchDoctor);

                    break;

                case 5:

                    String cancel =
                            view.getInput("Enter Patient Name: ");

                    view.showMessage(
                            controller.cancelAppointment(cancel));

                    break;

                case 6:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}