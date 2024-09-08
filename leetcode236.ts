type MultiDirectionalArray = (number | MultiDirectionalArray) [];
var flat = function (
    arr: MultiDirectionalArray,
    n: number
): MultiDirectionalArray {
    const ans: MultiDirectionalArray = [];
    function dfs(arr: number | MultiDirectionalArray, n: number) {
        if(typeof arr ==='number') {
            ans.push(arr);
        } else if(n===0) {
            for(const element of arr) {
               ans.push(element);
            }
        } else {
            for(const element of arr) {
                dfs(element,n-1);
            }
        }
    }
       
    dfs(arr,n);
    return ans;
};
function main() {
    const data: MultiDirectionalArray = [1, [2, [3, [4]], 5], 6];
    const depth = 2;
    const flatteneddata = flat(data,depth);
    console.log(flatteneddata);
}
main();