package pl.zaworov.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import pl.zaworov.model.MessagePrinter;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        MessagePrinter printer = container.select(MessagePrinter.class).get();
        printer.printMessage();

        weld.shutdown();
    }
}