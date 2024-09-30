class CustomStack {
    int[] arr;
    int index;
    int max_size;
    public CustomStack(int maxSize) {
        this.arr = new int[maxSize];
        this.index = 0;
        this.max_size = maxSize;
    }
    public void push(int x) {
        if (index < max_size) {
            arr[index] = x;
            index++;
        }
    }
    public int pop() {
        if (index != 0) {
            index--;
            return arr[index];
        }
        return -1;
    }
    public void increment(int k, int val) {
        for (int i = 0; i < k && i < index; i++) {
            arr[i] += val;
        }
    }
}
