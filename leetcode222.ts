type Fn1 = (...params: number[]) => number;
function memoize(fn: Fn1): Fn1{
    const cache: Record<string,number> = {} ;
    return function(...args) {
        const key = args.join('');
        return cache[key] === undefined ? (cache[key] = fn(...args)) : cache[key];

    };

}
function main() { 
    const add = (a: number, b: number) => a+b;
    const memoizeadd = memoize(add);
    console.log(memoizeadd(1,2));
    console.log(memoizeadd(1,2));
    console.log(memoizeadd(2,3));
    console.log(memoizeadd(2,3));



}
main();