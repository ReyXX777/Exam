type returnobj = {
    increment: () => number;
    decrement: () => number ;
    reset: () => number;
};
function create(init: number): returnobj {
    let cur = init;
    return {
        increment: () => ++cur,
        decrement: () => --cur,
        reset: () => (cur=init),


    };
}
function main() {
    const counter = create(10);
    console.log(counter.increment());
}
main();