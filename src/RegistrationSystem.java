import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationSystem {
    Admin admin;
    Student student;
    Authentication insert = new Authentication();
    int count = 0;

    public static boolean isValidPassword(String password) {
        // Checks if the password is at least 8 characters long and contains at least
        // one digit and one special character
        boolean hasDigit = false;
        boolean hasSpecial = false;
        if (password.length() < 8) {
            return false;
        }
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isWhitespace(c) || Character.isISOControl(c)) {
                return false; // reject whitespace or control characters
            } else if (!Character.isLetter(c)) {
                hasSpecial = true;
            }
        }
        return hasDigit && hasSpecial;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(012|011|015)\\d{8}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public void adminSignUp() {
        while (true) {
            System.out.println("Enter your id: ");
            Scanner scanner = new Scanner(System.in);
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter your first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter your street: ");
            String street = scanner.nextLine();
            System.out.println("Enter your city: ");
            String city = scanner.nextLine();
            System.out.println("Enter your phone number: ");
            String phoneNum = scanner.nextLine();
            System.out.println("Enter your gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter your role: ");
            String role = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            admin = new Admin(firstName, lastName, street, city, phoneNum, gender, id, role, password);

            if (!isValidPassword(admin.getPassword())) {
                System.out.println("Invalid password. Password must be at least 8 characters long and " +
                        "contain at least one digit and one special character.");
                continue;
            }

            if (!isValidPhoneNumber(admin.getPhoneNum())) {
                System.out.println("Invalid phone number. Phone number must be 11 digits long and start with 012, 011, or 015.");
                continue;
            }
            insert.InsertAdminAccount(admin);
            insert.InsertAdmin(admin);
            admin.editAccID(admin.getID());
            break;
        }

    }

    public void studentSignUp() {

        int id;
        String firstName, lastName;
        while (true) {

            System.out.println("Enter your id: ");
            Scanner scanner = new Scanner(System.in);
            id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter your first name: ");
            firstName = scanner.nextLine();
            System.out.println("Enter your last name: ");
            lastName = scanner.nextLine();
            System.out.println("Enter your street: ");
            String street = scanner.nextLine();
            System.out.println("Enter your city: ");
            String city = scanner.nextLine();
            System.out.println("Enter your phone number: ");
            String phoneNum = scanner.nextLine();
            System.out.println("Enter your gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter your department: ");
            String department = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            student = new Student(id,firstName, lastName, city,street, phoneNum, gender, department, password);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setCity(city);
            student.setStreet(street);
            student.setPhoneNum(phoneNum);
            student.setID(id);
            student.setDepartment(department);
            student.setPassword(password);
            student.setGender(gender);

            if (!isValidPassword(student.getPassword())) {
                System.out.println("Invalid password. Password must be at least 8 characters long and " +
                        "contain at least one digit and one special character.");
                continue;
            }

            if (!isValidPhoneNumber(student.getPhoneNum())) {
                System.out.println("Invalid phone number. Phone number must be 11 digits long and start with 012, 011, or 015.");
                continue;
            }
            insert.InsertStudentAccount(student);
            insert.InsertStudent(student);
            student.editAccID(student.getID());
            break;
        }

    }
}
