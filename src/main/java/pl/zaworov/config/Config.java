package pl.zaworov.config;

import pl.zaworov.qualifiers.FileName;

import javax.enterprise.inject.Produces;

public class Config {

    @Produces @FileName
    private String fileName = "/message.txt";

}
