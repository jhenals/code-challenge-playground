# Container with Most Water

## Description
You are given an integer array `height` of length n. There are n vertical lines drawn such that the two endpoints of the ith line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

## Examples
**Input**: height = [1,8,6,2,5,4,8,3,7]
**Output**: 49
**Explanation**: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
![image](https://github.com/user-attachments/assets/360819be-e435-441a-80fd-e13464012051)

**Input**: height = [1,1]
**Output**: 1

# SOLUTION
## Intuition
Given an array `height[]`, we want to find the maximum area of water that the container can hold. The container is formed between two lines `left_line` and `right_line` such that:
* `width = right_line - left_line`
* `height = min(height[left_line], height[right_line])`

## Approach
We use the **two-pointer technique**:

1. Initialize two pointer: `left` (pointer are the beginning) and `right` (pointer at the end of the array) and a variable `area` which is equals to 0 at first.
2. Compute the new area between `width` and `height` where:
* `width=right-left`
* `height=min(height[left], height[right])`
3. Update `area` if the _new area_ is larger than the _old one_.
4. Move the shorter pointer, that is to say, the pointer with smaller value (`min(height[left], height[right])`). This is because moving the taller one won't increase the height and it also means we are reducing the width, therefore, we wuld get smaller area.
5. We repeat this process as long as pointer left is smaller than pointer right

## Complexity
**Time complexity**: **O(n)** because we need to iterate all the n values of array height[]
**Space complexity**: **O(1)** because we don't use auxialiary variables that are dependent to the length of the array. Variables `left`, `right`, `area` are all constant, therefore space complexity is constant.

## Code
```
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right){
            //calculate area
            int w= right-left;
            int h= height[left]<height[right]? height[left] : height[right];
            area= w*h >area? w*h : area;

            //move pointer
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
```
