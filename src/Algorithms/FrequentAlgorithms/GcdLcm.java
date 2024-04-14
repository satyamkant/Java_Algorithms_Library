class GcdLcm{
        /**
         * gcd(x,x+y) = gcd(x,y)
         * gcd(x,x-y) = gcd(x,y)
         */

        private long calculateLcm(long bigger,long smaller){
                return bigger / calculateGcd(bigger, smaller) * smaller;
        }
        private long calculateGcd(long bigger,long smaller){
            while (true) {
                long remainder = bigger % smaller;
                if(remainder==0){
                    return smaller;
                }else{
                    bigger=smaller;smaller=remainder;
                }
            }
        }
        public long __gcd(long bigger,long smaller){
            return calculateGcd(bigger,smaller);
        }
        public long __lcm(long bigger,long smaller){
            return calculateLcm(bigger,smaller);
        }
    }
