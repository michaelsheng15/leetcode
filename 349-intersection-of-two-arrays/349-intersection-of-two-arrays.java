class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        
        int[] ans = new int[list.size()];
        System.out.println(ans.length);
        for(int k = 0; k < list.size(); k++){
            ans[k] = list.get(k);
        }
        
        
        
        return ans;
        
    }
}