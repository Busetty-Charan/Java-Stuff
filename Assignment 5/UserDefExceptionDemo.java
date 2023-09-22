class UserDefException extends Exception {

    UserDefException(String eMessage) {

        super(eMessage);
    }

    public String toString() {

        return this.getClass().toString() + " : " + super.getMessage();
    }
}

public class UserDefExceptionDemo {

    public static void main(String[] args) {

        // * Just throw the exception to demonstrate how it works

        try {

            if (1 < 2) {

                throw new UserDefException("This is a user defined exception");
            }
        } catch (UserDefException e) {

            System.out.println(e);
        }
    }
}
