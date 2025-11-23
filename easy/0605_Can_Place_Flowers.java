class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerbedLength = flowerbed.length;
        int numberPlanted = 0;

        for (int i = 0; i < flowerbedLength; i++) {
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbedLength - 1) ? 0 : flowerbed[i + 1];
            if (flowerbed[i] == 0 && left == 0 && right == 0) {
                flowerbed[i] = 1;
                numberPlanted++;
            }
            if (numberPlanted >= n) return true;
        }
        return numberPlanted == n;
    }
}
