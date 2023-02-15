package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error active: " + active);
        System.out.println("Error status: " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorMassage = new Error(true, 56, "Error Compile");
        errorMassage.printInfo();
        Error noError = new Error(false, 100, "Not Errors");
        noError.printInfo();
    }
}
