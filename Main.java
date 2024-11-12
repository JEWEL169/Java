public class Main {
    public static void main(String[] args) {
        JAVAProfessionalRobber robber = new JAVAProfessionalRobber();

        int[] rowHouses = {1, 2, 3, 0};
        System.out.println("RowHouses([1, 2, 3, 0]) -> " + robber.RowHouses(rowHouses));  

        int[] roundHouses = {1, 2, 3, 4};
        System.out.println("RoundHouses([1, 2, 3, 4]) -> " + robber.RoundHouses(roundHouses)); 

        int[] squareHouse = {5, 10, 2, 7};
        System.out.println("SquareHouse([5, 10, 2, 7]) -> " + robber.SquareHouse(squareHouse));  

        int[] rowHouses1 = {5, 3, 8, 2};
        int[] roundHouses1 = {10, 12, 7, 6};
        int[] squareHouse1 = {4, 9, 11, 5};
        int[] multiHouseBuilding1 = {8, 6, 3, 7};

        System.out.println("MultiHouseBuilding([5, 3, 8, 2], [10, 12, 7, 6], [4, 9, 11, 5], [8, 6, 3, 7]) -> "
                + robber.MultiHouseBuilding(rowHouses1, roundHouses1, squareHouse1, multiHouseBuilding1));  
    }
}
