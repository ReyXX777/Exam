declare global{
    interface Array<T> {
        last(): T | -1;
    }
}
Array.prototype.last = function(){
    return this.length ===0?-1:this[this.length-1];
};
export{};
function main() {
    const numbers = [1,2,3,4,5];
    const emptyArray: number[] = [];
    console.log(numbers.last());
    console.log(emptyArray.last());
}
main();