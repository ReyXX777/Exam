type Fn4<T> = () => Promise<T> ;
function PromiseAll<T> (functions:Fn4<T>[]): Promise<T[]> {
    return new Promise((resolve,reject) =>{
    const ans: T[] = [];
    let resolveCount =0;
    functions.forEach((fn,index)=>{
        fn().then((val)=>{
            ans[index] = val;
            if(++resolveCount===functions.length){
                resolve(ans);
            }
        }) .catch((error) =>{
            reject(error);
        });
    });
});
}
async function main() {
    const fn1: Fn4<number> = () => Promise.resolve(1);
    const fn2: Fn4<number> = () => Promise.resolve(2);
    const fn3: Fn4<number> = () => Promise.resolve(3);
    try{
        const results = await PromiseAll([fn1,fn2,fn3]);
        console.log(results);
    } catch(error) {
        console.error(error);
    }
    }
main();