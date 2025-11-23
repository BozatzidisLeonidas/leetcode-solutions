class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> isGreatestAmongKids = new ArrayList<>();

        int candiesLength = candies.length;
        int[] sortedCandies = Arrays.copyOf(candies, candiesLength);
        Arrays.sort(sortedCandies);
        int max = sortedCandies[candiesLength-1];

        for (int i = 0; i < candiesLength ; i++) {
            if(candies[i] + extraCandies >= max){
                isGreatestAmongKids.add(true);
            } else isGreatestAmongKids.add(false);
        }

        return isGreatestAmongKids; 
    }
}
