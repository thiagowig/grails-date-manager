package br.com.zaul.pomodoro

class Tag {

	String name
	
	static belongsTo = Task	
	static hasMany = [tasks: Task]
	
    static constraints = {
		name blank:false, unique: true
    }
}
