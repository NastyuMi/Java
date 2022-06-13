import java.util.Scanner;

public class Account {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private String alternateEmail;
    private Integer mailboxCapacity;

    public Account(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.alternateEmail = "none";
        this.mailboxCapacity = 500;

        generateEmail();
        generatePassword();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void generateEmail() {
        String email = this.firstName + "." + this.lastName + "@" + this.department + ".company.com";
        this.email = email.toLowerCase();
    }

    public static int getRandomInteger(int min, int max){
        return ((int) (Math.random() * (max - min))) + min;
    }

    public void generatePassword() {
        int length = getRandomInteger(14, 18);
        final String KEY = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_.-abcdefghijklmnopqrstuvwxyz";
        String password = "";

        for (int index = 0; index < length; index++) {
            char symbol = KEY.charAt((int) (Math.random() * KEY.length()));
            password = password.concat(String.valueOf(symbol));
        }

        this.password = password;
    }

    public void showInfo() {
        System.out.println("\nName: " + this.firstName + " " + this.lastName + "\nDepartment: " + this.department +
                "\nEmail: " + this.email + "\nPassword: " + this.password +
                "\nMailbox capacity: " + this.mailboxCapacity + " mb\nAlternate email: " + this.alternateEmail);
    }


    public Integer getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(Integer mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public static void main(String[] args) {
        String firstName, lastName, option, department, newPassword, email, capacity;
        String[] name;
        int answer1, answer2, answer3;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your Name and Surname: ");
            option = sc.nextLine();
            name = option.split(" ");

            if(name.length == 2) {
                firstName = name[0];
                lastName = name[1];

                break;
            } else {
                System.out.println("  Error, please enter correct name\n");
            }
        }

        System.out.println("\nDepartment codes");
        System.out.println("1 for Sales" );
        System.out.println("2 for Development");
        System.out.println("3 for Accounting" );
        System.out.println("0 for None");

        while (true) {
            System.out.print("Choose department by code: ");
            answer1 = Integer.parseInt(sc.nextLine());

            if (answer1 == 1) {
                department = "Sales";
                break;
            }
            else if (answer1 == 2) {
                department = "Development";
                break;
            }
            else if (answer1 == 3) {
                department = "Accounting";
                break;
            }
            else if (answer1 == 0) {
                department = "Employee";
                break;
            }
            else {
                System.out.println("Error, please, enter the correct number\n");
            }
        }

        Account employee = new Account(firstName, lastName, department);

        while (true) {
            System.out.println("Choice an option: ");
            System.out.println(" 1 - Show info about employee");
            System.out.println("2 - Change password");
            System.out.println("3 - Change mailbox capacity");
            System.out.println("4 - Set alternate email" );
            System.out.println("5 - Exit");

            System.out.print("Your answer: ");
            answer2 = Integer.parseInt(sc.nextLine());
            switch (answer2)
            {
                case(1):
                    employee.showInfo();
                case(2):
                    while (true) {
                        System.out.println("\nChoice an option: ");
                        System.out.println("1 - Generate new random password" );
                        System.out.println("2 - Enter new password");

                        System.out.print("\nYour answer: ");
                        answer3 = Integer.parseInt(sc.nextLine());
                        switch (answer3)
                        {
                            case(1):
                                employee.generatePassword();
                                System.out.println("\nNew password: " + employee.getPassword());
                                break;
                            case (2):
                                System.out.print("\nEnter new password: ");
                                newPassword = sc.nextLine();
                                employee.setPassword(newPassword);
                                System.out.println("\nNew password: " + employee.getPassword());
                                break;
                            default:
                                System.out.println("  Error, please enter the correct answer");

                        }

                    }
                case (3):
                    System.out.print("\nEnter new value of mailbox capacity: ");
                    capacity = sc.nextLine();
                    employee.setMailboxCapacity(Integer.parseInt(capacity));
                    System.out.println("\nNew mailbox capacity: " + employee.getMailboxCapacity() + " mb");
                case(4):
                    System.out.print("\nEnter alternate email: ");
                    email = sc.nextLine();
                    employee.setAlternateEmail(email);
                    System.out.println("\nNew alternate email: " + employee.getAlternateEmail());
                case(5):
                    break;
                default:
                    System.out.println("  Error, please enter the correct answer");

            }
        }
    }
}