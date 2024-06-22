package Seminars.Sem1.S1_ex01;

import java.time.LocalDate;
import java.util.List;

// import Seminars.Sem1.S1_ex01.impl.BottleOfWater;
// import Seminars.Sem1.S1_ex01.impl.EPackage;
import Seminars.Sem1.S1_ex01.impl.HotDrink;
import Seminars.Sem1.S1_ex01.impl.HotDrinkVendingMach;
// import Seminars.Sem1.S1_ex01.impl.WaterVendingMachine;

public class Main {
    public static void main(String[] args) {
        // Product bottle1 = new BottleOfWater("Saint P", 52, LocalDate.of(2024, 6, 20));
    
        // Product bottle2 = new BottleOfWater("Rodnik 52", 58, LocalDate.of(2024, 6, 20),
        //  true, EPackage.GLASS.getMaterial(), 0.5f);
         
         
        // VendingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle2, bottle2, bottle1));

        // System.out.println(vm.getProducts());

        // vm.getProduct("Rodnik 52");

        // System.out.println(vm.getProducts());

        Product hotDrink1 = new HotDrink("Tea", 105, LocalDate.of(2024, 6, 22), 50, 1f);

        Product hotDrink2 = new HotDrink("Coffee", 179, LocalDate.of(2024, 6, 21), 70, 1.5f);

        HotDrinkVendingMach hotDrinkMach = new HotDrinkVendingMach();

        hotDrinkMach.addProducts(List.of(hotDrink1, hotDrink1, hotDrink2, hotDrink2, hotDrink1));

        System.out.println(hotDrinkMach.getProducts());

        hotDrinkMach.getProduct("Coffee", 70, 1.5f);

        System.out.println("--------------");

        System.out.println(hotDrinkMach.getProducts());

    }
}
