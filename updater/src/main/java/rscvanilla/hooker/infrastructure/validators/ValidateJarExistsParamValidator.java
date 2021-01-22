package rscvanilla.hooker.infrastructure.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

import java.io.File;

public class ValidateJarExistsParamValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        if (value == null) {
            return;
        } else if (!new File(value).exists()) {
            throw new ParameterException("Parameter [" + name + "] value [" + value + "] doesn't reference to JAR file.");
        }
    }
}
