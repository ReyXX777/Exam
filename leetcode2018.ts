type Fn = (accum: number, curr: number) => number;
function reduce(nums: number[], fn: Fn, init: number): number {
    let ans = init;
    for(const num of nums) {
        ans = fn(ans,num);
    }
    return ans;
}
function main() {
    const nums = [1,2,3,4,5];
    const sum = reduce(nums, (accum, curr) => accum + curr,0);
    console.log(sum);
    const product = reduce(nums, (accum,curr) => accum*curr,1);
    console.log(product);
}
main();