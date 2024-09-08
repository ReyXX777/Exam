type jsonValue =
| null
| boolean
| number
| string
| jsonValue[]
| {[key: string]: jsonValue};
function Alength(...args: jsonValue[]): number {
    return args.length;
}
function main() {
    console.log(Alength(1,"string",true,null));
    console.log(Alength({key: "value"}, [1,2,3]));
    console.log(Alength());
}
main();