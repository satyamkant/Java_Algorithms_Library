class DijkstraAlgorithm{
    private class Comp implements Comparator<List<Integer>>{

        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            return o1.get(0).compareTo(o2.get(0));
        }

        @Override
        public Comparator<List<Integer>> reversed() {
            return Comparator.super.reversed();
        }
    }

    /// the incoming graph does not contains any edge weigth all are 1 so change logic accordingly
    private List<Integer> shortestPath(List<List<Integer>> adj, int s,int n){
        List<Integer> shortestPath = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            shortestPath.add(Integer.MAX_VALUE);
        }
        PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>(new Comp());
        minHeap.add(Arrays.asList(0,s));
        shortestPath.set(s,0);
        while(!minHeap.isEmpty()){
            int node = minHeap.peek().get(1);
            int preDist = minHeap.peek().get(0);
            minHeap.poll();

            for(Integer X: adj.get(node)){
                if(preDist + 1 < shortestPath.get(X)){
                    shortestPath.set(X, preDist + 1);
                    minHeap.add(Arrays.asList(shortestPath.get(X), X));
                }
            }
        }

        return shortestPath;
    }

    public List<Integer> getShortestPath(List<List<Integer>> adj, int s, int n){
        return shortestPath(adj, s, n);
    }
}
