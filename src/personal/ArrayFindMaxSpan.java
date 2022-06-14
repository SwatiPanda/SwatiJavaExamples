package personal;

public class ArrayFindMaxSpan {
    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 1, 4, 1, 4};

        CalculateSpanAndIndex calculateSpanAndIndex = new CalculateSpanAndIndex();
        int maxSpan = calculateSpanAndIndex.getMaxSpan(nums);
        System.out.println("Max span is: "+maxSpan);

    }
}
    class CalculateSpanAndIndex {
        public int getLastIndex(int i, int[] nums) {
            int lastIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]==nums[j]){
                    lastIndex = j;
                }
            }
            return lastIndex;
        }

        public int getMaxSpan(int[] nums) {
            int maxSpan = 0;
            if(nums.length <= 0){
                return maxSpan;
            }
            for (int i = 0; i < nums.length; i++) {
                int lastIndex = this.getLastIndex(i, nums);
                int span = lastIndex - i + 1;
                maxSpan = Math.max(span, maxSpan);

            }
            return maxSpan;

        }

}


