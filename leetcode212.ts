function create(){
    return function(): string {
        return 'hello world';

    };
}
function main() {
    const hello = create();
    console.log(hello());
}
main();