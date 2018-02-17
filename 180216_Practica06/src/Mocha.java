public class Mocha extends Drink{
    public Mocha(String size){
        this.size = size;
    }
    public String getDescription() {
        return "Mocha";
    }
    @Override
    public double cost() {
        if(this.size =="Small"){
            return 70.00;
        }
        else if(this.size == "Medium"){
            return 80.00;
        }
        else if(this.size == "Large"){
            return 90.00;
        }
        else{
            return 70.00;
        }
    }
}
