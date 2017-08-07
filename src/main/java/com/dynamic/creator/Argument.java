package com.dynamic.creator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by nuhma on 2017-08-06.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Argument {

    @Getter
    @Setter
    protected String type;

    @Getter
    @Setter
    protected String value;

    @Override
    public String toString() {
        return this.type+" "+this.value;
    }
}
