package ir.maktab74.repository;

import ir.maktab74.domain.Service;
import ir.maktab74.util.ApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServiceRepository {

    public ServiceRepository() {
    }

    public void save(File serviceFile, Service service) throws IOException {
        FileWriter fileWriter = new FileWriter(serviceFile, true);
        fileWriter.write(service.getFirstName() + " " + service.getLastName() + " " + service.getServiceType() + " " + service.getAmount() + "$\n");
        fileWriter.close();
    }

    public void findAll(ApplicationContext context, File serviceFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(serviceFile);
        context.getMenu().showServiceListFile(scanner);
    }
}
