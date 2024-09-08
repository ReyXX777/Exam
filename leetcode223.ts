type P = Promise<number>;

async function addTwoPromises(promise1: P, promise2: P): P {
  const results = await Promise.all([promise1, promise2]);
  return results[0] + results[1];
}

// Main method to execute addTwoPromises function
async function main() {
  const promise1: P = Promise.resolve(5);
  const promise2: P = Promise.resolve(10);

  const result = await addTwoPromises(promise1, promise2);
  console.log(result); // Output: 15
}

// Call the main method
main();
