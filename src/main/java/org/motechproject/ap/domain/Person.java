package org.motechproject.ap.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.annotations.InSet;
import org.motechproject.mds.annotations.NotInSet;
import org.motechproject.mds.annotations.UIDisplayable;
import org.motechproject.mds.annotations.UIFilterable;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.util.Date;

@Entity
public class Person {

    @Field
    @UIDisplayable
    public String firstName;

    @Field
    @UIDisplayable
    public String lastName;

    @Field
    Date birthDate;

    @UIFilterable
    public Boolean alive;

    @Field
    @UIFilterable
    @DecimalMin(value = "3")
    @DecimalMax(value = "4")
    @InSet(value = {"3", "3.14", "4"})
    @NotInSet(value = {"1", "2", "5"})
    public Integer pi;
}
