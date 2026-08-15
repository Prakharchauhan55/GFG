class Solution {
    public int towerOfHanoi(int n, int A, int B, int C) {
        // int count = 0;
        
        // towerOfHanoi(n-1, A, C, B);
        // count++;
        // towerOfHanoi(n-1, B, A, C);
        return (int)Math.pow(2,n)-1;
    }
}
