package com.dynamic.creator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by nuhma on 2017-08-06.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Variable extends Argument {

    @Setter
    @Getter
    public List<String> accessModifiers;

    @Override
    public String toString() {
        String variableString = "";
        for(String accessMod:this.accessModifiers){
            variableString += " "+accessMod;
        }
        variableString = variableString+" "+this.type+" "+this.value;
        return variableString;
    }
}
