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
    private static final DateTimeFormatter APPOINTMENT_PARSER = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
    
    // Task 1: Parse the appointment date using DateTimeFormatter
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, APPOINTMENT_PARSER);
    }

    // Task 2: Check if an appointment date has already passed
    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return appointmentDate.isBefore(currentDateTime);
    }

    // Task 3: Check if appointment is in the afternoon
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        // Retrieve only the time component
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    // Task 4: Describe the time and date of the appointment
    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + DESCRIPTION_FORMATTER.format(appointmentDate) + ".";
    }

    // Task 5: Return the anniversary date
    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
