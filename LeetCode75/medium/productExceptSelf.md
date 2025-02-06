# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The idea is to use two auxiliary array, prefix, which is the left product and suffix, which corresponds to the write product. Using Bruteforce approach will  lead to TLE, so what we gonna do is iterate the array twice to avoid nested loop.

# Approach
<!-- Describe your approach to solving the problem. -->
1.  First, we compute the prefix product for each element excluding self.
Example: nums=[1, 2, 3, 4]
when i=0:
    answer[0]=prefix=1;
    prefix*=nums[0] -> 1*=1
    answer[0]=prefix=1
prefix =1

when i=1:
    answer[1]=1
    prefix*=nums[1]-> 1*2=2
    answer[1]=prefix=1
prefix=2

when i=2:
    answer[2]=prefix=2
    prefix*=nums[2]->2*3=6
    answer[2]=prefix=2
prefix=6

when i=3:
    answer[3]=prefix=6
    prefix*=nums[3] ->6*3=18
    answer[3]=prefix=6


SO the prefix array become: answer=[1,1,2,6]

2. Then, we compute the suffix product while updating the result in place of answer array.

suffix=1;
when i=n-1=3:
    answer[3]*=suffix -> 6*1=6
    suffix*=nums[3] -> 1*4=4
suffix=4

when i=2:
    answer[2]=answer[2]*4=2*4=8
    suffix=suffix*nums[2]=4*3=12
suffix=12

when i=1:
    answer[1]=answer[1]*suffix=1*12=12
    suffix=suffix*nums[1]=12*2=24
suffix=24

when i=0:
    answer[0]=1*24=24
    suffix=24*1=24

After iteration the updated array is: answer=[24,12,8,6]


# Complexity
- Time complexity: O(n) because it passer over the array
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: 0(1) when we don't consider the output array
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[]= new int[n];

        int prefix=1, suffix=1;
        //prefix
        for(int i=0; i<n; i++){
            answer[i]=prefix;
            prefix*=nums[i];
        }

        //suffix
        for(int i=n-1; i>=0; i--){
            answer[i]*=suffix;
            suffix*=nums[i];
        }
        return answer;
    }
}
```
