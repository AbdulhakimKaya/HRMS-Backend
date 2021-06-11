package kodlamaio.hrms.core.utilities.results;

import java.util.Random;
import java.util.UUID;

public class GenerateRandomCode {

    public UUID generateCode() {
        UUID code = UUID.randomUUID();
        return code;
    }
}
