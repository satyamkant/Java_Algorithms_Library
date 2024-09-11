class DisjointSetUnion{
    private int[] parent;
    private int[] rank;

    private int findSet(int v){
        if(v == parent[v]){
            return v;
        }

        return parent[v] = findSet(parent[v]);
    }

    private void unionSet(int v, int w){
        int find = findSet(v);
        int findW = findSet(w);
        if(find != findW){
            if(rank[find] < rank[findW]){
                find^=findW;
                findW^=find;
                find^=findW;
            }

            parent[findW] = find;
            if(rank[find] == rank[findW]){
                rank[find]++;
            }
        }
    }
   /** /////////////////////////////////////////////////////////////// **/
    public void init(int n ){
        parent = new int[n+1];
        rank = new int[n+1];

        for(int i = 0; i <= n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int getParent(int v){
        return findSet(v);
    }

    public void union(int v,int w){
        unionSet(v,w);
    }

    public boolean isSameSet(int v, int w){
        return findSet(v) == findSet(w);
    }

}
