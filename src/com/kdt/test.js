function Person(name){
    this.name = name;
    this.aa2 = function(){
        console.log("fasdf");
    }
    this.show1 = function(){
    }
}

Person.prototype.sayHello = function(){
    console.log("Hello:"+this.name);
};

function Employee(name,age){
    //Person.call(this,name);
    this.age = age;
    this.aa1 = function(){
        console.log("fdasdf");
    }
    function save1(){
        console.log("Age:"+this.age);
    }
    this.save11 = save1();
};

Employee.prototype = new Person("");

var Man = {
    aa : "afdsadf",
    show : function(){
        console.log("fsadf");
    }
}

Employee.prototype = Man;

var e = new Employee("fasdf",12);
e.sayHello();
e.aa2();
e.name = "fasfdasdf";
e.age = "dfsadf";
e.save11();
e.show();
e.show1();

