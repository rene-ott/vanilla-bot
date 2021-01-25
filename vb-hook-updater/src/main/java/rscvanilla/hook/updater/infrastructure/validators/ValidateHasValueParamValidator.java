package rscvanilla.hook.updater.infrastructure.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class ValidateHasValueParamValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if (value == null) {
            throw new ParameterException("Parameter [" + name + "] value is missing.");
        }
    }
}
