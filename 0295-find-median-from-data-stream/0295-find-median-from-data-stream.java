class MedianFinder {
    PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer> minheap;
    public MedianFinder() {
        minheap=new PriorityQueue<>();
        maxheap=new PriorityQueue<>(Comparator.reverseOrder());
    }
    
    public void addNum(int num) {
        if((minheap.size()+maxheap.size())%2==0){
            minheap.add(num);
            maxheap.add(minheap.poll());
        }
        else{
            maxheap.add(num);
            minheap.add(maxheap.poll());
    }
    }
    
    public double findMedian() {
        if((minheap.size()+maxheap.size())%2==0){
            return ((double)minheap.peek()+(double)maxheap.peek())/2.0;
        }
        return maxheap.peek()/1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */