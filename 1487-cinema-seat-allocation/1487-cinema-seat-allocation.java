import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            if (!map.containsKey(seat[0])) {
                map.put(seat[0], new HashSet<>());
            }
            map.get(seat[0]).add(seat[1]);
        }
        
        int count = 0;
        
        for (int row : map.keySet()) {
            HashSet<Integer> set = map.get(row);
            boolean block1 = !(set.contains(2) || set.contains(3) || set.contains(4) || set.contains(5));
            boolean block2 = !(set.contains(4) || set.contains(5) || set.contains(6) || set.contains(7));
            boolean block3 = !(set.contains(6) || set.contains(7) || set.contains(8) || set.contains(9));
            
            if (block1 && block3) {
                count += 2;
            } else if (block1 || block2 || block3) {
                count += 1;
            }
        }
        
        int rowsWithoutReservation = n - map.size();
        count += rowsWithoutReservation * 2;
        
        return count;
    }
}
