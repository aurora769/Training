function getArray(items :any[]) :any[]{
    return new Array().concat(items);
}
let myNumArr=getArray([100,200,300]);
let myStrArr=getArray(["Hello","World"]);
myNumArr.push(400);
myStrArr.push("Hello TypeScript");
myNumArr.push("Hi");
myStrArr.push(500);
console.log(myNumArr);
console.log(myStrArr);
