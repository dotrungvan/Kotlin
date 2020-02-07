package animal

class Dog (var nameP:String, var weightP:Int){
	var name: String = nameP
			get() = nameP
			set(nameP){
				field = nameP;
			};
	var weight:Int = weightP;
	
	fun roar(){
		println("gru");
	}
}