package tm.itbachelors.projectclassiccars;

// Talha Arif - r1066207

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tm.itbachelors.projectclassiccars.model.Car;
import tm.itbachelors.projectclassiccars.model.Maintenance;
import tm.itbachelors.projectclassiccars.model.Owner;
import tm.itbachelors.projectclassiccars.model.Staff;
import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootApplication
public class ProjectclassiccarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectclassiccarsApplication.class, args);
	
//	System.out.println("\n-- PART 1 --\n");
//		ArrayList<Owner> ownerList = new ArrayList<>();
//
//		Owner owner1 = new Owner("Talha", "Arif");
//		owner1.setNationality("PK");
//		owner1.setYearOfBirth(2006);
//		owner1.addToWishList("Toyota");
//		owner1.addToWishList("Honda");
//		ownerList.add(owner1);
//
//		Owner owner2 = new Owner("Marta", "Bianchi");
//		owner2.setNationality("IT");
//		owner2.setYearOfBirth(1998);
//		owner2.addToWishList("Ferrari");
//		owner2.addToWishList("Lamborghini");
//		owner2.addToWishList("Alfa Romeo");
//		owner2.addToWishList("Fiat");
//		owner2.addToWishList("Lancia");
//		ownerList.add(owner2);
//
//		Owner owner3 = new Owner("Marcus", "Webb");
//		owner3.setYearOfBirth(1990);
//		owner3.addToWishList("Ford");
//		owner3.addToWishList("Chevrolet");
//		owner3.addToWishList("Dodge");
//		ownerList.add(owner3);
//
//		int counter = 1;
//		for (Owner o : ownerList) {
//			System.out.println("Information owner " + counter);
//			System.out.println(o);
//			System.out.println("Wish list of " + o.getFirstName() + ":");
//			for (String wish : o.getWishList()) {
//				System.out.println("-" + wish);
//			}
//			System.out.println();
//			counter++;
//		}
//
//	System.out.println("\n-- PART 2 --\n");
//		Staff staff1 = new Staff("Marco", "Rossi");
//		staff1.setSenior(true);
//		staff1.setStartDate(LocalDate.of(2017, 5, 10));
//
//		Staff staff2 = new Staff("Elena", "Braun");
//		staff2.setStartDate(LocalDate.of(2020, 11, 3));
//
//		Staff staff3 = new Staff("James", "Carter");
//		staff3.setSenior(true);
//		staff3.setStartDate(LocalDate.of(2014, 8, 22));
//
//		System.out.println(staff1 + (staff1.isSenior() ? " *" : ""));
//		System.out.println(staff2 + (staff2.isSenior() ? " *" : ""));
//		System.out.println(staff3 + (staff3.isSenior() ? " *" : ""));
//
//	System.out.println("\n-- PART 3 --\n");
//		Car car1 = new Car("Toyota", "Supra");
//		car1.setKilometers(52000);
//		Maintenance m1 = new Maintenance("Spark Plug Replacement", 90, 25.0);
//		m1.setResponsible(staff1);
//		Maintenance m2 = new Maintenance("Coolant Flush", 60, 20.0);
//		m2.setResponsible(staff2);
//		Maintenance m3 = new Maintenance("Timing Belt Check", 150, 35.0);
//		m3.setResponsible(staff3);
//
//		car1.addMaintenance(m1);
//		car1.addMaintenance(m2);
//		car1.addMaintenance(m3);
//		car1.registerOwner(owner1);
//
//		Car car2 = new Car("Ford", "Mustang");
//		car2.setKilometers(33000);
//		Maintenance m4 = new Maintenance("Air Filter Swap", 45, 15.0);
//		m4.setResponsible(staff2);
//		Maintenance m5 = new Maintenance("Wiper Blade Change", 30, 10.0);
//		m5.setResponsible(staff1);
//
//		car2.addMaintenance(m4);
//		car2.addMaintenance(m5);
//		car2.registerOwner(owner3);
//
//		ArrayList<Car> carList = new ArrayList<>();
//		carList.add(car1);
//		carList.add(car2);
//
//		for (Car car : carList) {
//			System.out.println("\n** " + car.getName() + " **");
//			System.out.println("This car has " + car.getNumberOfMaintenances() + " number of maintenances");
//			double totalCost = 0;
//			for (Maintenance m : car.getMaintenances()) {
//				System.out.println("- " + m.getType()
//						+ ", duration: " + m.getDuration() + " minutes"
//						+ ", rate: " + m.getHourlyRate()
//						+ ", price: " + m.getPrice()
//						+ " (Done by: " + m.getResponsible() + ")");
//				totalCost += m.getPrice();
//			}
//			System.out.println("Total cost: " + totalCost);
//		}
//
//	System.out.println("\n-- PART 4 --");
//		for (Owner o : ownerList) {
//			if (o.getFirstName().equals("Talha")) {
//				System.out.println(o);
//			}
//		}
//
//	System.out.println("\nThe end ...");
    }
}