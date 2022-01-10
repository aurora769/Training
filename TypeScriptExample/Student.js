"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(i, n, s) {
        this.stdID = 123;
        this.stdName = "Namrata";
        this.stdSubject = "Maths";
        this.stdID = i;
        this.stdName = n;
        this.stdSubject = s;
    }
    Student.prototype.display = function () {
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdSubject);
    };
    return Student;
}());
exports.Student = Student;
var e1 = new Student(123, "Namrata", "Maths");
e1.display();
