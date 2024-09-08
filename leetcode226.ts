type Fn2 = (...params: any[]) => Promise<any>;

function timeLimit(fn: Fn2, t: number): Fn2 {
  return async function (...args) {
    const p1 = new Promise((_, reject) => {
      setTimeout(() => reject('Time Limit Exceeded'), t);
    });
    const p2 = fn(...args);
    return Promise.race([p1, p2]);
  };
}

// Main method to demonstrate the timeLimit function
async function main() {
  const exampleFunction: Fn2 = async (message: string) => {
    return new Promise((resolve) => {
      setTimeout(() => resolve(`Completed: ${message}`), 2000);
    });
  };

  const limitedFunction = timeLimit(exampleFunction, 1000);

  try {
    const result = await limitedFunction("Hello, World!");
    console.log(result);
  } catch (error) {
    console.error(error);
  }
}

// Call the main method
main();
