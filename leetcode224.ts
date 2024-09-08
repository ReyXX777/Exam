async function sleep(millis: number): Promise<void> {
    return new Promise((resolve) => {
        setTimeout(resolve,millis);
    });
}
async function main(){
    console.log('sleeping for 2 sec');
    await sleep(2000);
    console.log('awake now!')
}
main();