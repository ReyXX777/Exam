type Fn =(n: number,i: number) => any;
function filter(arr:number[],fn:Fn): number[] {
    const ans: number[] = [];
    arr.forEach((a,index) =>{
        if(fn(a,index)) {
            ans.push(a);
        }
    });
    return ans;
}
function main() {
    const arr =[1,2,3,4,5];
    const result = filter(arr, (n,i)=>n%2===0);
    console.log(result);
}
main();