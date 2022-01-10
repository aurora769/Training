var Greatest = /** @class */ (function () {
    function Greatest() {
    }
    return Greatest;
}());
function GreatestNo(a, b, c) {
    if (a > b && a > c) {
        console.log("A is Big", a);
    }
    else if (b > a && b > c) {
        console.log("b is big", b);
    }
    else {
        console.log("c is big", c);
    }
}
var n = new Greatest();
console.log(GreatestNo(12, 25, 89));
//console.log(this.display());
