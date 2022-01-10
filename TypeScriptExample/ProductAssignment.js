"use strict";
exports.__esModule = true;
exports.ProductAssignment = void 0;
// Create a product class The properties are ProID, ProName, ProPrice ,add GST as additional tax for ProPrice display the data.
var ProductAssignment = /** @class */ (function () {
    function ProductAssignment(i, n, s) {
        this.prdID = 123;
        this.prdName = "namrata";
        this.prdPrice = 25;
        this.prdID = i;
        this.prdName = n;
        this.prdPrice = s;
    }
    ProductAssignment.prototype.display = function () {
        console.log(this.prdID);
        console.log(this.prdName);
        console.log(this.prdPrice);
    };
    return ProductAssignment;
}());
exports.ProductAssignment = ProductAssignment;
function calculateAmount(prdPrice) {
    var totalPrice = prdPrice + (prdPrice * 0.18);
    return totalPrice;
}
var e1 = new ProductAssignment(124, "Toys", 240);
var e2 = new ProductAssignment(135, "Teady Bear", 250);
e1.display();
e2.display();
console.log(calculateAmount(230));
