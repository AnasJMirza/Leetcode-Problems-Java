package com.anas;

//interface MountainArray {
//      public int get(int index) {}
//      public int length() {}
//}

public class FindMountainArray {
    public static void main(String[] args) {

    }


    public int findInMountainArray(int target, MountainArray mountainArr) {
        // 1. find the peak element
        int peak = findPeak(mountainArr);
        // 2. search in the first half
        int firstHalf = binarySearch(target, 0, peak, mountainArr, true);
        // 3. search in the second half
        if(firstHalf != -1){
            return firstHalf;
        }

        return binarySearch(target, peak, mountainArr.length() - 1, mountainArr, false);








    }

    int binarySearch(int target,int start1, int end1, MountainArray mountainArr, boolean isAsc){
        int start = start1;
        int end = end1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == mountainArr.get(mid)){
                return mid;
            } else if (target > mountainArr.get(mid)){
                if(isAsc){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(isAsc){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    int findPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
