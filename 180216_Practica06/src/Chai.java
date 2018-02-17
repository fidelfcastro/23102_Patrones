public class Chai extends Drink {
    public Chai(String size){
        this.size = size;
    }
    public String getDescription() {
        return "Chai";
    }
    @Override
    public double cost() {
        if(this.size =="Small"){
            return 50.00;
        }
        else if(this.size == "Medium"){
            return 60.00;
        }
        else if(this.size == "Large"){
            return 70.00;
        }
        else{
            return 50.00;
        }
    }
}
