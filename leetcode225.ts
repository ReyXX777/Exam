type JSONValue =
 | null
 | boolean
 | number
 | string 
 | JSONValue[]
 | {[key:string]: JSONValue};
 type fn = (...args: JSONValue[]) => void;
 function cancellable(Fn:fn,args: JSONValue[],t:number): Function{
    const timer = setTimeout(()=>Fn(...args),t);
    return function() {
        clearTimeout(timer);
    };
 }
 function main() {
    const logmessage: fn =(message: JSONValue) => {
        console.log(message);
    };
    const cancel = cancellable(logmessage,['hello,world'],3000);
    console.log("message will be logged in 3 sec");
 }
 main();