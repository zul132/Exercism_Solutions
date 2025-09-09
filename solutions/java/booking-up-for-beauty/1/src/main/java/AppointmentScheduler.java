/* 
    Problem: Booking Up For Beauty

    Topic: Date-Time
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

class AppointmentScheduler {
    // Task 1: Parse the appointment date using DateTimeFormatter
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter appointmentDateParser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, appointmentDateParser);
    }

    // Task 2: Check if an appointment date has already passed
    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return appointmentDate.isBefore(currentDateTime);
    }

    // Task 3: Check if appointment is in the afternoon
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        // Retrieve only the time component
        LocalTime appointmentTime = appointmentDate.toLocalTime();
        return appointmentTime.isAfter(LocalTime.of(11,59,59)) && appointmentTime.isBefore(LocalTime.of(18,0,0));
    }

    // Task 4: Describe the time and date of the appointment
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter descriptionFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + descriptionFormatter.format(appointmentDate) + ".";
    }

    // Task 5: Return the anniversary date
    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
