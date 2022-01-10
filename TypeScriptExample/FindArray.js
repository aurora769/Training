var FindArray = /** @class */ (function () {
    function FindArray() {
        this.numarr = [1, 2, 3, 4];
    }
    FindArray.prototype.find = function () {
        for (this.i = 0; this.i < this.numarr.length; this.i = this.i + 1) {
            if (5 == this.numarr[this.i]) {
                console.log("number found");
            }
        }
    };
    return FindArray;
}());
var arr = new FindArray();
arr.find();
