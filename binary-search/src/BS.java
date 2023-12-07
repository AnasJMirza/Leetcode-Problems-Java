public class BS {
    public static void main(String[] args) {
        System.out.println("Q: Find target in ascending sorted array");

        int[] arr = {1,7,9,12,15,21};
        int idx = bs(arr, 79);
        if(idx != -1) {
            System.out.println("target at index = " + idx);
        }
        if(idx == -1) {
            System.out.println("target not found");
        }

        System.out.println("Q: Find traget in order agnostic sorted array");
        int[] orderAgnosticArray = {9,6,5,4,3,2,1};
        int orderAgnosticIdx = orderAgnosticBinarySearch(orderAgnosticArray, 21);
        if(orderAgnosticIdx != -1) {
            System.out.println("target at index = " + orderAgnosticIdx);
        }
        if(orderAgnosticIdx == -1) {
            System.out.println("target not found");
        }
    }


    // return target index if found else return -1
    // assume array is sorted in ascending order
    static int bs(int[] arr, int target) {
        // array can be empty
        if(arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // case: middle element = target
            if(arr[mid] == target) {
                return mid;
            }

            // case: middle element > target
            if(arr[mid] > target) {
                end = mid - 1;
            }

            // case: middle element < target
            if(arr[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }

    // return target index if found else return -1
    // assume array is sorted
    // it could be in ascending or descending order

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        // array can be empty
        if(arr.length == 0) {
            return -1;
        }

        // determining the order
        boolean isAsc = false;
        if(arr[0] <= arr[arr.length - 1]) {
            isAsc = true;
        }

        int start = 0;
        int end = arr.length -1;

        if(isAsc) {
            while (start <= end) {
                int mid = (start + end) / 2;

                // case: middle element = target
                if(arr[mid] == target) {
                    return mid;
                }

                // case: middle element > target
                if(arr[mid] > target) {
                    end = mid - 1;
                }

                // case: middle element < target
                if(arr[mid] < target) {
                    start = mid + 1;
                }

            }

        }

        if(!isAsc) {
            while (start <= end) {
                int mid = (start + end) / 2;

                // case: middle element = target
                if(arr[mid] == target) {
                    return mid;
                }

                // case: middle element > target
                if(arr[mid] > target) {
                    start = mid + 1;
                }

                // case: middle element < target
                if(arr[mid] < target) {
                    end = mid - 1;
                }

            }
        }


        return -1;
    }
}
