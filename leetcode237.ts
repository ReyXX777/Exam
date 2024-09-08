type JSONValue7 = 
| null
| string
| number
| boolean
| JSONValue7[]
| { [key: string]:JSONValue7};
type Obj2 = Record<string,JSONValue7> | Array<JSONValue7>;
function compact(obj: Obj2): Obj2 {
    return dfs(obj) as Obj2;

}
function dfs(value: JSONValue7): JSONValue7 {
    if(value===null){
        return null;
    }
    if(Array.isArray(value)) {
        return value.filter(Boolean).map(dfs);
    }
    if(typeof value === 'object'){
        for(const key of Object.keys(value)) {
            if(Boolean(value[key])) {
                value[key] = dfs(value[key]);
            } else {
                delete value[key];
            }
        }
    }
    return value;
}
function main() {
    const data: Obj2 = {
        a: null,
        b: false,
        c: 0,
        d: '',
        e: 'hello',
        f: [null, 1, '', true, false, { g: null, h: 2 }]
    };
    const compactdata = compact(data);
    console.log(compactdata);

}
main();