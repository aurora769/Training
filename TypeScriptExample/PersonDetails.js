"use strict";
exports.__esModule = true;
var PersonDetails = /** @class */ (function () {
    function PersonDetails() {
    }
    PersonDetails.prototype.getFullName = function () {
        return this.first + this.last;
    };
    return PersonDetails;
}());
var p1 = new PersonDetails();
p1.first = "Namrata";
p1.last = "Arora";
console.log(p1.getFullName());
