public static int maxArea(int[] height) {
        int length = height.length;
        int result = 0;
        for (int i = 0, j = length - 1; i < length;) {
            int area = Math.min(height[i], height[j]) * (j - i);
            if(area>result) {
                result = area;
            }
            if(height[i] > height[j]) {
                j--;
            } else i++;
        }
        return result;
    }
