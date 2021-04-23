package model;

import java.util.List;

import com.github.reinert.jjschema.Attributes;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Employee {

    @Attributes(required = true, minimum = 0, maximum = 12, description = "ID of the employee")
    @SerializedName("id")
    private int id;

    @Attributes(required = true, minLength = 1, maxLength = 15, description = "First name of the employee")
    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    @Attributes(required = true, minLength = 5, maxLength = 22, description = "Last name of the employee")
    private String lastName;

    @SerializedName("age")
    @Attributes(required = true, description = "Age in years of the employee")
    private int age;

    @SerializedName("gender")
    @Attributes(required = true, enums = {"Male", "Female"},description = "Gender of the employee")
    private String gender;

    @SerializedName("addresses")
    @Attributes(required = true, minItems = 1, maxItems = 3, description = "Address lines of the employee")
    private List<String> address;

}
