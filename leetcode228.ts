type F = (...args: number[]) => void;

function debounce(fn: F, t: number): F {
  let timeout: ReturnType<typeof setTimeout> | undefined;
  return function (...args) {
    clearTimeout(timeout);
    timeout = setTimeout(() => fn(...args), t);
  };
}

function main() {
  const logMessage = (message: string) => console.log(message);
  const debouncedLog = debounce((message: string) => logMessage(message), 1000);

  debouncedLog("Hello, World!"); // This will be logged after 1 second
  debouncedLog("Hello, again!"); // This will cancel the previous log and log this message after 1 second
}

main();
