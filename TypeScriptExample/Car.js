var Car = /** @class */ (function () {
    function Car(i, n, s) {
        this.Speed = 12;
        this.RPrice = 123;
        this.Color = "Red";
        this.Speed = i;
        this.RPrice = n;
        this.Color = s;
    }
    Car.prototype.Car = function () {
    };
    Car.prototype.display = function () {
        console.log(this.Speed);
        console.log(this.RPrice);
        console.log(this.Color);
    };
    return Car;
}());
function getSalePrice(prdPrice) {
    var totalPrice = (prdPrice / 100) + prdPrice * 0.18;
    return totalPrice;
}
console.log(getSalePrice(230));
