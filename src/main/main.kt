package main

import animal.Dog

fun main(args: Array<String>) {
//	oantuti();
//	var d = Dog("a",12);
//	println("DOG is name:${d.name}, weigh:${d.weight}")
//	d.roar();
	println("ab".capitalize());
	"ab".capitalize().also { println("Argument for Base: $it") };
}

fun oantuti(){
	var arrRule =  arrayOf("dam","la","keo");
	var userChoose : String = "";
	var repeat : String = "y";
	while("y".equals(repeat)){
		var computerChoose : String  = computer(arrRule);
		print("Nhap vao:");
		for(i in arrRule) print(" ${i}");
		println(".");
		userChoose = user(arrRule);
		println("May: ${computerChoose}.");
		println("Nguoi choi: ${userChoose}.");
		println("Ket qua: ${result(computerChoose,userChoose)}");
		print("Ban muon choi lai khong (y/n): ");
		repeat = readLine().toString().toLowerCase();
	}
}
fun computer(arrRule:Array<String>):String = arrRule[(Math.random()*arrRule.size).toInt()];

fun user(arrRule:Array<String>):String {
	var userChoose = "";
	var isValid = true;
	while(isValid){
		val userInput = readLine();
		for(i in arrRule){
			if(i.toLowerCase().equals(userInput.toString().toLowerCase())){
				isValid = false;
				break;
			}
		}
		if(isValid)
			println("Nhap vao khong hop le");
		else
			userChoose = userInput.toString().toLowerCase();
	}
	return userChoose;
}
fun result(computer:String, user:String):String{
	if(computer.equals(user)) return "Hoa";
	if(("dam".equals(computer) && "keo".equals(user)) || ("keo".equals(computer) && "la".equals(user)) || ("la".equals(computer) && "dam".equals(user))){
		return "May thang";
	}
	if(("dam".equals(computer) && "la".equals(user)) || ("keo".equals(computer) && "dam".equals(user)) || ("la".equals(computer) && "keo".equals(user))){
		return "Ban thang";
	}
	return "Khong xac dinh";
}