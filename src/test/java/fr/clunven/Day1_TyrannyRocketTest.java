package fr.clunven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.clunven.Day1_TyrannyRocket;

public class Day1_TyrannyRocketTest {
    
    @Test
    public void testPart1() {
        Assertions.assertEquals(2, new Day1_TyrannyRocket().fuelForModule(12));
        Assertions.assertEquals(2, new Day1_TyrannyRocket().fuelForModule(14));
        Assertions.assertEquals(654, new Day1_TyrannyRocket().fuelForModule(1969));
        Assertions.assertEquals(33583, new Day1_TyrannyRocket().fuelForModule(100756));
        System.out.println("Part1:");
        new Day1_TyrannyRocket().runDay1Part1();
    }
    
    @Test
    public void testPart2() {
        Assertions.assertEquals(2, new Day1_TyrannyRocket().fuelForModuleAndFuel(14));
        Assertions.assertEquals(966, new Day1_TyrannyRocket().fuelForModuleAndFuel(1969));
        Assertions.assertEquals(50346, new Day1_TyrannyRocket().fuelForModuleAndFuel(100756));
        System.out.println("Part2:");
        new Day1_TyrannyRocket().runDay1Part2();
    }

}
