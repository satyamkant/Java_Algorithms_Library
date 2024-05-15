class PrimeFactors{
        /**
         *
         * @param n integer
         * @return ArrayList of integers which are prime factors of n
         * runs in O(Sqrt(n)) worst case (when n is prime)
         */
        private ArrayList<Long> calculate(long n){
            ArrayList<Long> arr = new ArrayList<>();
            for(long x = 2; x * x <=  n; x++){
                while(n%x == 0){
                    arr.add(x);
                    n/=x;
                }
            }
            if(n > 1)arr.add(n);
            return arr;
        }
        public ArrayList<Long> getFactors(long n){
            return calculate(n);
        }
}

// prime factors in repeated query log(N)
class PrimeFactors{
        private final int N;
        private final int[] spf;

        private void sieve(){
            for(int i = 2;i < N;i++){
                if (spf[i] == 1)
                {
                    spf[i] = i;
                    for (long j = (long) i * i; j <= N; j += i)
                    {
                        if (spf[(int) j] == 1)spf[(int) j] = i;
                    }
                }
            }
        }

        PrimeFactors() {
            this.N = 1000005;
            this.spf = new int[N+1];
            for(int i = 0;i < N;i++){
                spf[i] = 1;
            }
            sieve();
        }

        List<Integer> getPrimeFactors(int n){
            List<Integer> ans = new LinkedList<>();
            while(n > 1){
                int fact = spf[n];
                while(n % fact == 0){
                    n /= fact;
                    ans.add(fact);
                }
            }
            return ans;
        }
    }

