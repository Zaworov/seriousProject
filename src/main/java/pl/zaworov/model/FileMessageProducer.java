package pl.zaworov.model;

import jakarta.inject.Inject;
import pl.zaworov.qualifiers.FileName;
import pl.zaworov.qualifiers.Message;
import pl.zaworov.qualifiers.Message.MessageType;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Message(type = MessageType.FILE)
public class FileMessageProducer implements MessageProducer {

    @Inject @FileName
    private String fileName;

    @Override
    public String getMessage() {
        List<String> lines = null;
        try {
            Path path = new File(getClass().getResource(fileName).toURI()).toPath();
            lines = Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        String result = "";
        if (lines != null)
            result = lines.stream().reduce(result, (a, b) -> a + b);
        return result;
    }
}