export class Student{
    stdID:number=123;
    stdName:string="Namrata";
    stdSubject:string="Maths"
    constructor(i:number,n:string,s:string){
        this.stdID=i;
        this.stdName=n;
        this.stdSubject=s;
    }
    display()
    {
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdSubject);
    }
}
var e1=new Student(123,"Namrata","Maths");
e1.display();