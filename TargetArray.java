class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] out = new int[nums.length];
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            temp.add(index[i], nums[i]);
        }
        for(int i=0; i<temp.size(); i++){
            out[i] = temp.get(i);
        }
        return out;
    }
}
