type JSONValue6 = 
| {}
| null
| boolean
| number
| string
| JSONValue6[]
| {[key: string]: JSONValue6 };

type Item = {[key: string]: JSONValue6} & {
    id: number;
};
function join(arr1: Item[], arr2: Item[]): Item[] {
    const idToObj: { [key: number]: Item} = {};
    for(const item of arr1) {
        idToObj[item.id] = item;
    }
    for(const item of arr2){
        if(idToObj[item.id]===undefined) {
            idToObj[item.id] = item;
        } else {
            for(const key of Object.keys(item)) {
                idToObj[item.id][key] = item[key];
            }
        }
    }
    const ans = Object.values(idToObj);
    ans.sort((a,b) => a.id - b.id);
    return ans;

}
function main() {
    const data1 : Item[] = [
        { id: 1, name: 'apple' },
        { id: 2, name: 'banana' }
    ];
    const data2: Item[] = [
        { id: 2, color: 'yellow' },
        { id: 3, name: 'carrot', color: 'orange' }
    ];
    const joineddata = join(data1,data2);
    console.log(joineddata);
}
main();