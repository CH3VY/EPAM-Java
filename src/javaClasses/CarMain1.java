package javaClasses;
import java.util.*;

// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

public class CarMain1 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean check = false;

        Car[] carList = new Car[12];
        carList[0] = new Car("001", "Chevrolet", "Suburban", 2019, "White", 37000, "KZ332012");
        carList[1] = new Car("002", "Vauxhall", "Monaro", 2005, "Red", 56000, "KZ051316");
        carList[2] = new Car("003", "Ford", "Explorer", 2005, "Black", 9500, "KZ065744");
        carList[3] = new Car("004", "Buick", "Regal", 1987, "Black", 62500, "KZ011438");
        carList[4] = new Car("005", "Dodge", "RAM", 2020, "Orange",42500, "KZ012917");
        carList[5] = new Car("006", "Chevrolet", "Suburban", 2016, "Grey", 41450, "KZ045778");
        carList[6] = new Car("007", "Chevrolet", "Suburban", 2019, "Black", 22900, "KZ033265");
        carList[7] = new Car("008", "Ford", "Explorer", 2016, "White", 51250, "KZ068569");
        carList[8] = new Car("009", "Vauxhall", "Monaro", 2005, "Blue", 27500, "KZ047561");
        carList[9] = new Car("010", "Dodge", "RAM", 2019, "Orange", 62000, "KZ033516");
        carList[10] = new Car("011", "Dodge", "RAM", 2020, "White", 48600, "KZ035496");
        carList[11] = new Car("012", "Buick", "Regal", 2016, "White", 24950, "KZ087562");


        do {
            System.out.print("Select your request: A / B / C\n");
            System.out.println("A) List of cars by manufacturer");
            System.out.println("B) List of cars of selected model in use for over [n] years");
            System.out.println("C) List of cars of selected year that cost more than [m] USD\n");
            String carInput = input.nextLine();

            if (("A".equals(carInput)) || ("a".equals(carInput))) {

                System.out.print("Select the manufacturer: ");
                HashMap<String, ArrayList<Car>> carByManufacturer = new HashMap<String, ArrayList<Car>>();


                for (int i = 0; i < carList.length; i++){

                    String currentManufacturer = carList[i].getManufacture();
                    ArrayList<Car> currentList = carByManufacturer.get(currentManufacturer);
                    if (currentList == null){
                        currentList = new ArrayList<Car>();
                        currentList.add(carList[i]);
                        carByManufacturer.put(currentManufacturer, currentList);

                    } else {
                        currentList.add(carList[i]);
                    }
                }
                System.out.println(carByManufacturer.keySet().toString());

                String selectedManuf = input.nextLine();

                if(carByManufacturer.containsKey(selectedManuf)){
                    System.out.println(carByManufacturer.get(selectedManuf).toString());
                    check = true;
                } else{
                    System.out.println("Invalid input, try again.");
                    check = false;
                }
            }



            else if (("B".equals(carInput)) || ("b".equals(carInput))) {

                System.out.print("Select the model: ");
                HashMap<String, ArrayList<Car>> carByModel = new HashMap<String, ArrayList<Car>>();

                for (int i = 0; i < carList.length; i++) {

                    String currentModel = carList[i].getModel();
                    ArrayList<Car> currentList = carByModel.get(currentModel);
                    if (currentList == null) {
                        currentList = new ArrayList<Car>();
                        currentList.add(carList[i]);
                        carByModel.put(currentModel, currentList);

                    } else {
                        currentList.add(carList[i]);
                    }
                }
                System.out.println(carByModel.keySet().toString());

                String selectedModel = input.nextLine();
                if (carByModel.containsKey(selectedModel)) {
                    check = true;
                } else {
                    System.out.println("Invalid input, try again.");
                    check = false;
                    System.exit(0);
                }


                System.out.println("Specify the number of years in use: ");

                int years = 0;
                if(input.hasNextInt()){
                    years = input.nextInt();
                    ArrayList<Car> selectedModelList = carByModel.get(selectedModel);
                    ArrayList<Car> validCarList1 = new ArrayList<>();
                    for(Car j : selectedModelList){
                        if(j.getInUse()>= years){
                            validCarList1.add(j);
                            System.out.println(j.getColor() + " " + j.getManufacture() + " " + j.getModel() + " " + j.getYear()+ " " + j.getRegNumber());
                        }else{System.out.println("No matches found..");}
                    }
                    check = true;
                } else{
                    System.out.println("Invalid input, try again.");
                    check = false;
                    System.exit(0);}
            }


            else if (("C".equals(carInput)) || ("c".equals(carInput))) {
                System.out.print("Select the year: ");
                HashMap<Integer, ArrayList<Car>> carByYear = new HashMap<Integer, ArrayList<Car>>();

                for (int i = 0; i < carList.length; i++){

                    Integer currentYear = carList[i].getYear();
                    ArrayList<Car> currentList = carByYear.get(currentYear);
                    if (currentList == null){
                        currentList = new ArrayList<Car>();
                        currentList.add(carList[i]);
                        carByYear.put(currentYear, currentList);

                    } else {
                        currentList.add(carList[i]);
                    }
                }
                System.out.println(carByYear.keySet().toString());

                int selectedYear = 0;
                if(input.hasNextInt()) {
                    selectedYear = input.nextInt();
                    if (carByYear.containsKey(selectedYear)) {
                        check = true;
                    } else{
                        System.out.println("The entered year is out of range.");
                        check = false;
                        System.exit(0);
                    }
                }else{System.out.println("Invalid input, try again.");
                    check = false;
                    System.exit(0);}

                System.out.println("Specify the minimum cost of a vehicle: ");

                int price = 0;
                if(input.hasNextInt()){
                    price = input.nextInt();
                    ArrayList<Car> selectedYearList = carByYear.get(selectedYear);
                    ArrayList<Car> validCarList2 = new ArrayList<>();
                    for(Car k : selectedYearList){
                        if(k.getPrice() > price){
                            validCarList2.add(k);
                            System.out.println(k.getColor() + " " + k.getManufacture() + " " + k.getModel() + " " + k.getYear()+ " " + k.getRegNumber() + " | Price: $" + k.getPrice());
                        }else{System.out.println("No matches found..");}
                    }
                    check = true;
                }
                else{
                    System.out.println("Invalid input, try again.");
                    check = false;
                    System.exit(0);}
            }
            else{System.out.println("Invalid input. Try again..");}


        } while(!check);
    }
}