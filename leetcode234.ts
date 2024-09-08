type JSONValue5 = 
| null
| boolean
| number
| string
| JSONValue5[]
| { [key: string] : JSONValue5};
type Fn5 = (value: JSONValue5) => number;
function sortBy(arr: JSONValue5[], fn: Fn5): JSONValue5[] {
    arr.sort((a,b)=>fn(a) - fn(b));
    return arr;
}
function main() {
    const data: JSONValue5[] = [
        { value: 3 },
        { value: 1 },
        { value: 4 },
        { value: 2 }
    ];
    const sortedData = sortBy(data,item=>(item as {value: number}).value);
    console.log(sortedData);
}
main();