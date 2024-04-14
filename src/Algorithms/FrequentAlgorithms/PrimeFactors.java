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
