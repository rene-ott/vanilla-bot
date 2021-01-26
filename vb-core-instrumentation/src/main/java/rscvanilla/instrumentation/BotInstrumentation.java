package rscvanilla.instrumentation;

import rscvanilla.instrumentation.transformers.MudClientTransformer;

import javax.inject.Inject;
import java.lang.instrument.Instrumentation;

public class BotInstrumentation {

    private final Instrumentation instrumentation;
    private final MudClientTransformer mudClientTransformer;

    @Inject
    public BotInstrumentation(Instrumentation instrumentation, MudClientTransformer mudClientTransformer) {
        this.instrumentation = instrumentation;
        this.mudClientTransformer = mudClientTransformer;
    }

    public void transform() {
        instrumentation.addTransformer(mudClientTransformer);
    }
}
