class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int arr[] = new int[n];
        int brr[] = new int[n];
        brr[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            arr[i + 1] = arr[i] ^ derived[i];
            brr[i + 1] = brr[i] ^ derived[i];
        }
        if ((arr[0] ^ arr[n - 1]) == derived[n - 1] || (brr[0] ^ brr[n - 1]) == derived[n - 1]) {
            return true;
        }
        return false;
    }
}
