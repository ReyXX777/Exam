function createCounter(n: number): () => number {
    return function () {
      return n++;
    };
  }
  
  function main() {
    const counter = createCounter(10);
    console.log(counter()); // 10
    console.log(counter()); // 11
    console.log(counter()); // 12
  }
  
  main();
  