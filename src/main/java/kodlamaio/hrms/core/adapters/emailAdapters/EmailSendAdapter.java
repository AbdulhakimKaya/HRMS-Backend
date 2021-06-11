package kodlamaio.hrms.core.adapters.emailAdapters;

import kodlamaio.hrms.emailVerification.EmailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendAdapter implements EmailAdapter{

    EmailSender emailSender = new EmailSender();
    @Override
    public boolean emailSend(String email) {
        return emailSender.emailVerification(email);
    }


}
