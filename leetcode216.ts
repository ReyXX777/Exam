function map(arr: number[],fn:(n:number , i:number) =>number): number[] {
    for(let i=0;i<arr.length;++i){
        arr[i] = fn(arr[i],i);
    }
    return arr;
}
function main() {
    const arr = [1,2,3,4,5];
    const result = map(arr,(n,i) =>n*i);
    console.log(result);
}
main();