class SegmentTree{
    private final int N;
    private final long[] tree;
    private final long[] lazy;
    private long operation(long a,long b){return a+b;}

    private void build(long[] arr,int node,int tl,int tr){
        if(tl == tr)
            tree[node] = arr[tl];
        else{
            int mid = (tl + tr)>>1;
            build(arr,2*node + 1,tl,mid);
            build(arr,2*node + 2,mid+1,tr);
            tree[node] = operation(tree[2*node + 1],tree[2*node + 2]);
        }
    }

    private void push(int node){
        tree[2*node + 1] = operation(tree[2*node + 1],lazy[node]);
        lazy[2*node + 1] = operation(lazy[2*node + 1],lazy[node]);
        tree[2*node + 2] = operation(tree[2*node + 2],lazy[node]);
        lazy[2*node + 2] = operation(lazy[2*node + 2],lazy[node]);
        lazy[node] = 0L;
    }

    private long query(int node,int tl,int tr,int l,int r){
        if(l > r)
            return 0;
        if(l == tl && tr == r)
            return tree[node];
        push(node);
        int mid = (tl + tr)>>1;

        long left = query(2*node + 1,tl,mid,l,Math.min(r,mid));
        long right = query(2*node + 2,mid + 1,tr,Math.max(l,mid+1),r);

        return operation(left,right);
    }

    private void update(int node,int tl,int tr,int l,int r,long newVal){
        if(l > r)
            return;
        if(l == tl && tr == r){
            tree[node] = operation(tree[node],newVal);
            lazy[node] = operation(lazy[node],newVal);
            return;
        }

        push(node);
        int mid = (tl + tr)>>1;
        update(2*node + 1,tl,mid,l,Math.min(r,mid),newVal);
        update(2*node + 2,mid+1,tr,Math.max(l,mid+1),r,newVal);
        tree[node] = operation(tree[2*node + 1],tree[2*node + 2]);
    }

    /**
     * @param arr = input array
     * @param n = size of the input array
     */
    public SegmentTree(long[] arr,int n){
        this.N = n;
        tree = new long[4*N + 1];
        lazy = new long[4*N + 1];

        for(int i = 0;i <= 4*N;i++){
            tree[i] = 0L;
            lazy[i] = 0L;
        }
        build(arr,0,0,N-1);
    }

    /**
     * @noArgs constructor
     * initiates the tree with size 4*N
     * size of arr is 100000
     * arr contains the numbers from 1 to 100000
     */
    public SegmentTree(){
        this.N = 500000;
        tree = new long[4*N];
        lazy = new long[4*N];
        long[] arr = new long[N+1];
        for(int i = 0;i <= 4*N;i++){
            tree[i] = 0L;
            lazy[i] = 0L;
        }
        for(int i = 1;i <= N;i++){
            arr[i] = i;
        }
        build(arr,0,0,N-1);
    }


    public long getQuery(int l,int r){
        return query(0,0,N-1,l,r);
    }

    public void updateAt(int pos,long newVal){
        update(0,0,N-1,pos,pos,newVal);
    }

    public void rangeUpdate(int l,int r,int newVal){
        update(0,0,N-1,l,r,newVal);
    }
}
