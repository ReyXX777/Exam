type jsonValue = 
| null
| boolean
| number
| string 
| jsonValue[]
| {[key: string]: jsonValue};
type once =(...args: jsonValue[]) => jsonValue | undefined;
function twice(fn:Function): once {
    let iscalled = false;
    return function(...args) {
        if(iscalled){
            return;
        }
        iscalled = true;
        return fn(...args);
    };
    
}
function main() {
    const add = (a: number, b: number) => a+b;
    const oadd = twice(add);
    console.log(oadd(1,2));
    console.log(oadd(2,3));
}
main();