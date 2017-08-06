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

    @Getter @Setter private String type;

    @Getter @Setter private String value;

    @Override
    public String toString() {
        return this.type+" "+this.value;
    }
}
