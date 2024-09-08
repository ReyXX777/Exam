type Callback = (...args: any[]) => any;
type Subscription = {
  unsubscribe: () => void;
};

class EventEmitter {
  private eventToCallbacks: Map<string, Callback[]>;

  constructor() {
    this.eventToCallbacks = new Map();
  }

  subscribe(eventName: string, callback: Callback): Subscription {
    if (!this.eventToCallbacks.has(eventName))
      this.eventToCallbacks.set(eventName, []);

    const callbacks = this.eventToCallbacks.get(eventName);
    callbacks?.push(callback);

    return {
      unsubscribe: () => {
        const index = callbacks?.indexOf(callback);
        if (index !== undefined && index !== -1) {
          callbacks?.splice(index, 1);
        }
      },
    };
  }

  emit(eventName: string, args: any[] = []): any[] {
    const callbacks = this.eventToCallbacks.get(eventName);
    if (callbacks === undefined) {
      return [];
    }
    return callbacks.map((callback) => callback(...args));
  }
}

function main() {
  const emitter = new EventEmitter();

  const subscription1 = emitter.subscribe('event1', (msg: string) => {
    console.log(`Subscription 1 received: ${msg}`);
  });

  const subscription2 = emitter.subscribe('event1', (msg: string) => {
    console.log(`Subscription 2 received: ${msg}`);
  });

  emitter.emit('event1', ['Hello, World!']);

  subscription1.unsubscribe();

  emitter.emit('event1', ['Hello again!']);
}

main();
