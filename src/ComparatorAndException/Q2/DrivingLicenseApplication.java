package ComparatorAndException.Q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws ParseException, NotEligibleException {
        System.out.println("Please enter a DateOfBirth in format (dd/mm/yyyy)");
        String dateFormat = "dd/mm/yyyy";
        Scanner scanner = new Scanner(System.in);
        Date date = (new SimpleDateFormat(dateFormat).parse(scanner.nextLine()));
        System.out.println(date);

//Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();

//Calculating the difference between given date to current date.
        Period period = Period.between(givenDate, LocalDate.now());
        int age = period.getYears();

//check age of the applicant to apply for a driving license
        try
        {
          if (age < 16)
            throw new NotEligibleException();
        }
        catch (NotEligibleException e)
        {
            System.out.println(e.getMessage());
        }
    }
}