var StudentAssignment = /** @class */ (function () {
    function StudentAssignment(i, n, s) {
        this.SID = 12;
        this.SName = "Namrata";
        this.SClass = 5;
        this.SID = i;
        this.SName = n;
        this.SClass = s;
    }
    StudentAssignment.prototype.display = function () {
        console.log(this.SID);
        console.log(this.SName);
        console.log(this.SClass);
    };
    return StudentAssignment;
}());
var s1 = new StudentAssignment(10, "Yash", 9);
s1.display();
var s2 = new StudentAssignment(15, "Tej", 11);
s2.display();
