type JSONValue =
 | null
 | boolean
 | number
 | string
 | JSONValue[]
 |{[key: string]:JSONValue}; 
 type Obj = Record<string,JSONValue> | JSONValue[];
 function isEmpty(obj: Obj): boolean {
    if(Array.isArray(obj)) {
        return Object.keys(obj).length===0;
    }
    return Object.keys(obj).length ===0;

 }
 function main() {
    const emptyArray: JSONValue[] = [] ;
    const nonEmptyArray: JSONValue[] = [1,2,3];
    const emptyObject: Record<string, JSONValue> = {};
    const nonEmptyObject: Record<string, JSONValue> ={key: "value"};
    console.log(isEmpty(emptyArray)); // Output: true
  console.log(isEmpty(nonEmptyArray)); // Output: false
  console.log(isEmpty(emptyObject)); // Output: true
  console.log(isEmpty(nonEmptyObject)); // Output: false
 }
 main();