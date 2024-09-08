type JSONValue1 = 
| null
| boolean
| number
| string
| JSONValue1[]
| {[key: string]: JSONValue1};
type Obj1 = Record<string,JSONValue1> | Array<JSONValue1>
function chunk(arr: Obj1[],size: number): Obj1[][] {
    const ans: Obj1[][] = [];
    for(let i=0;i<arr.length;i+=size) {
        ans.push(arr.slice(i,i+size));
    }
    return ans;
}
function main() {
    const array: Obj1[] = [
        { key1: "value1" },
    { key2: "value2" },
    { key3: "value3" },
    { key4: "value4" },
    { key5: "value5" },
    ];
    const chunkarray = chunk(array,2);
    console.log(chunkarray);
}
main();