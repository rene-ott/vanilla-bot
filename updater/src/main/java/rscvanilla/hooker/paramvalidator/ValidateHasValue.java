package rscvanilla.hooker.paramvalidator;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class ValidateHasValue implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if (value == null) {
            throw new ParameterException("Parameter [" + name + "] value is missing.");
        }
    }
}
