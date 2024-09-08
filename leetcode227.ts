interface TTLValue{
    value: number;
    timer: ReturnType<typeof setTimeout>;
}
class Time{
    private cache = new Map<number,TTLValue>();
    set(key:number,value: number,duration: number): boolean {
        const exists = this.cache.has(key);
        if(exists) {
            clearTimeout(this.cache.get(key)!.timer);
        }
        this.cache.set(key,{
            value, timer: setTimeout(()=>this.cache.delete(key),duration),
        });
        return exists;
    }
    get(key: number): number {
        return this.cache.has(key) ? this.cache.get(key)!.value : -1;
    }
    count(): number{
        return this.cache.size;
    }
}
function main(){
    const cache = new Time();
    console.log(cache.set(1,100,5000));
    console.log(cache.get(1));
    setTimeout(() =>{
        console.log(cache.get(1));
    },6000);
    console.log(cache.set(1,200,3000));
    console.log(cache.count());
    setTimeout(() =>{
        console.log(cache.count());
    },4000);
}
main();