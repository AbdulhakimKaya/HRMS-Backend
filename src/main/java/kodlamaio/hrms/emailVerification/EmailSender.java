package kodlamaio.hrms.emailVerification;

public class EmailSender {
    public boolean emailVerification(String email) {

        if (email.equals("aaaaaa@gmail.com")) {
            return true;
        }
        else {
            return false;
        }
    }
}
