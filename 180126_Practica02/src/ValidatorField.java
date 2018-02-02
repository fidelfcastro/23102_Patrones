public class ValidatorField {
    ValidateBehavior validator;
    String value;

    public ValidatorField(ValidateBehavior validator, String value){
        this.validator = validator;
        this.value = value;
    }

    public boolean validate(){
        return validator.validate(value);
    }
}

