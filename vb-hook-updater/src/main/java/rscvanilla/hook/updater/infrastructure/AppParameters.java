package rscvanilla.hook.updater.infrastructure;

import com.beust.jcommander.Parameter;
import rscvanilla.hook.updater.infrastructure.validators.ValidateHasValueParamValidator;
import rscvanilla.hook.updater.infrastructure.validators.ValidateJarExistsParamValidator;

public class AppParameters {
    @Parameter(
            names = "-n",
            description = "New client.jar path from which field names are matched. Hooks file is generated based on matched values.",
            validateWith = { ValidateHasValueParamValidator.class, ValidateJarExistsParamValidator.class },
            required = true
    )
    public String newJarPath;

    @Parameter(
            names = "-o",
            description = "Old client.jar path from which field names are matched (Optional). Used for manual verification.",
            validateWith = { ValidateJarExistsParamValidator.class }
    )
    public String oldJarPath;

    @Parameter(
            names = "-sd",
            description = "Skips JAR decompile and extract phase. Assumes there's already temp dir."
    )
    public boolean skipDecompilation;

    @Parameter(
            names = "-sv",
            description = "Skips manual member name matcher verification phase."
    )
    public boolean skipVerification;

    @Parameter(
            names = "-st",
            description = "Skips temp dir deletion after process."
    )
    public boolean skipTempDirDeletion;
}
