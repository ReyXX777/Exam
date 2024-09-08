type tbnb = {
    tobe: (v: any) => boolean;
    notbe: (v: any) => boolean;
};

function exp(v: any): tbnb {
    return {
        tobe: function (v2: any) {
            if (v === v2) {
                return true;
            }
            throw 'not equal';
        },
        notbe: function (v2: any) {
            if (v !== v2) {
                return true;
            }
            throw 'equal';
        },
    };
}

function main() {
    try {
        console.log(exp(5).tobe(5)); // true
        console.log(exp(5).notbe(3)); // true
        console.log(exp(5).tobe(3)); // throws 'not equal'
    } catch (e) {
        console.error(e);
    }
}

main();
