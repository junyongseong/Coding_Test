function solution(nums) {
    const jong = new Set(nums);
    const max = nums.length/2;
    // console.log(jong)
    return Math.min(jong.size,max)
}