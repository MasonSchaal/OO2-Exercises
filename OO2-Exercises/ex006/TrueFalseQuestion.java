
public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion() {
        super();
    }
    
    public String getText() {
        return "Answer True or False: " + super.getText();
    }
    public String getAnswer() {
        return super.getAnswer().toLowerCase();
    }
    
    public boolean checkAnswer(String response) {
        return ((response.toLowerCase().charAt(0)) == (this.getAnswer().charAt(0)));
    }
}
