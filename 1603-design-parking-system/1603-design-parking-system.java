// Max optimized solution
public class ParkingSystem {
    final private int[] carSlots;

    public ParkingSystem(int big, int medium, int small) {
        carSlots = new int[3];
        carSlots[0] = big;
        carSlots[1] = medium;
        carSlots[2] = small;
    }

    public boolean addCar(int carType) {
        int availableSlots = carSlots[carType-1];
        if (availableSlots > 0) {
            carSlots[carType-1] = availableSlots - 1;
            return true;
        }

        return false;
    }
}

// Using some OOP
// public class ParkingSystem {
//     final private Map<CarType, CarSlot> carSlots;

//     public ParkingSystem(int big, int medium, int small) {
//         carSlots = new HashMap<>();
//         carSlots.put(CarType.BIG, new CarSlot(big));
//         carSlots.put(CarType.MEDIUM, new CarSlot(medium));
//         carSlots.put(CarType.SMALL, new CarSlot(small));
//     }

//     public boolean addCar(int carType) {
//         CarSlot carSlot = carSlots.getOrDefault(CarType.fromInt(carType), null);
//         if (Objects.isNull(carSlot)) {
//             throw new RuntimeException();
//         }

//         return carSlot.addCar();
//     }

//     private enum CarType {
//         BIG,
//         MEDIUM,
//         SMALL;

//         public static CarType fromInt(int carType) {
//             return switch (carType) {
//                 case 1 -> BIG;
//                 case 2 -> MEDIUM;
//                 case 3 -> SMALL;
//                 default -> throw new RuntimeException();
//             };
//         }
//     }

//     private static class CarSlot {
//         private int availablePlaces;

//         CarSlot(int places) {
//             this.availablePlaces = places;
//         }

//         public boolean addCar() {
//             if (availablePlaces <= 0) {
//                 return false;
//             }

//             availablePlaces--;
//             return true;
//         }
//     }
// }