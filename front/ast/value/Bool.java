package front.ast.value;

import front.ast.Type;

public class Bool extends Value{
    public Boolean value;

    public Bool(String value) {
        if(value.equals("True")){
            this.value = true;
        }else{
            this.value = false;
        }
        type = Type.Bool;
    }

    @Override
    public String toString() {
        if(value){
            return "True";
        }else{
            return "False";
        }
    }
}