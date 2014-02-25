package br.com.zaul.pomodoro

class Task {
	
	String summary
	String details
	Date dateCreated
	Date deadline
	Long timeSpent = 0L
	
	static hasMany = [tags: Tag]

    static constraints = {
		summary blank:false, unique: true
		details blank:false
		deadline nullable:false
		timeSpent min:0   
    }
}
