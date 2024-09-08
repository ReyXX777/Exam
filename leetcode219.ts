type f = (x: number) => number;
function compose(functions: f[]): f {
    return function(x) {
        return functions.reduceRight((val,F) =>F(val), x);
    };
}
function main() {
    const add =(x: number) => x+1 ;
    const multiply = (x: number) => x*2;
    const subtract = (x: number) => x-3;
    const composed = compose([add, multiply, subtract]);
    console.log(composed(5));
}
main();