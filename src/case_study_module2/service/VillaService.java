package case_study_module2.service;

import case_study_module2.model.Villa;
import case_study_module2.repository.VillaRepository;
import case_study_module2.repository.impl.IVillaRepository;
import case_study_module2.service.impl.IVillaService;

import java.util.List;
import java.util.Scanner;

public class VillaService implements IVillaService {
    Scanner scanner = new Scanner(System.in);
    IVillaRepository iVillaRepository = new VillaRepository();
    public void display() {
        List<Villa> result = iVillaRepository.display();
        System.out.println(result);
    }
    public void add() {
        System.out.println("Enter new name service:");
        String nameService = scanner.nextLine();
        System.out.println("Enter new area uses:");
        String areaUses = scanner.nextLine();
        System.out.println("Enter new cost rent:");
        String costRent = scanner.nextLine();
        System.out.println("Enter new amount people:");
        String amountPeople = scanner.nextLine();
        System.out.println("Enter new type rent:");
        String typeRent = scanner.nextLine();
        System.out.println("Enter new standard:");
        String standard = scanner.nextLine();
        System.out.println("Enter new area pool:");
        String areaPool = scanner.nextLine();
        System.out.println("Enter new amount floor:");
        String amountFloor = scanner.nextLine();
        Villa villa = new Villa(nameService,areaUses,costRent,amountPeople,typeRent,standard,areaPool,amountFloor);
        iVillaRepository.add(villa);
    }
}