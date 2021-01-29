package rscvanilla.bot.infrastructure.printer;

public interface Printer {
     void printAsBot(String message, Object... args);
     void printAsScript(String message, Object... args);
}
