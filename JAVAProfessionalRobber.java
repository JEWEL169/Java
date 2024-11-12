import java.util.Arrays;

class JAVAProfessionalRobber extends Robber {

    @Override
    public int RowHouses(int[] houses) {
        if (houses == null || houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];
        if (houses.length == 2) return Math.max(houses[0], houses[1]);

        int prev1 = houses[0]; 
        int prev2 = Math.max(houses[0], houses[1]); 

        for (int i = 2; i < houses.length; i++) {
            int current = Math.max(houses[i] + prev1, prev2);  
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }

    @Override
    public int RoundHouses(int[] houses) {
        if (houses == null || houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];

        int excludeFirst = RowHouses(Arrays.copyOfRange(houses, 1, houses.length));
        int excludeLast = RowHouses(Arrays.copyOfRange(houses, 0, houses.length - 1));

        return Math.max(excludeFirst, excludeLast);
    }

    @Override
    public int SquareHouse(int[] houses) {
        if (houses == null || houses.length == 0) return 0;
        return RowHouses(houses);  
    }

    public int MultiHouseBuilding(int[]... houses) {
        int totalMax = 0;
        
        for (int[] houseArray : houses) {
            totalMax += RowHouses(houseArray);  
        }
        
        return totalMax;
    }

    @Override
    public int MuliHouseBuilding(int[] houses) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

