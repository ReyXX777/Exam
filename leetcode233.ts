export {};
declare global {
    interface Array<T> {
        groupBy(fn:(item:T)=>string): Record<string,T[]>;

    }
}
Array.prototype.groupBy = function<T> (fn:(item: T) =>string): Record<string,T[]> {
    const ans: Record<string,T[]> = {};
    for(const item of this) {
        const key = fn(item);
        if(ans[key]===undefined){
            ans[key] = [];
        }
        ans[key].push(item);
    }
    return ans;
};
function main() {
    const data = [
        { category: 'fruit', name: 'apple' },
    { category: 'fruit', name: 'banana' },
    { category: 'vegetable', name: 'carrot' },
    { category: 'vegetable', name: 'broccoli' }
    ];
    const groupedData = data.groupBy(item=>item.category);
    console.log(groupedData);
}
main();