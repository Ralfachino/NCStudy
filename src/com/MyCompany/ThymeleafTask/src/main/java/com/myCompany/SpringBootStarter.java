package com.myCompany;

import com.myCompany.service.FileIO;
import com.sun.xml.internal.ws.server.ServerRtException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication
public class SpringBootStarter {

    public static void main(String[] args) throws FileNotFoundException {

       SpringApplication.run(SpringBootStarter.class, args);
    }
}
