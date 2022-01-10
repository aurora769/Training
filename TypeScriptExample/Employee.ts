export class Employee{
    empID:number=123;
    empName:string="Namrata";
    empSal:number=21249
    constructor(i:number,n:string,s:number){
        this.empID=i;
        this.empName=n;
        this.empSal=s;
    }
    display()
    {
        console.log(this.empID);
        console.log(this.empName);
        console.log(this.empSal);
    }
}
var e1=new Employee(123,"Namrata",21249);
e1.display();