/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StudentRelationship
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-17T11:13:23.323Z")
public class StudentRelationship {
  /**
   * Gets or Sets relationship
   */
  @JsonAdapter(RelationshipEnum.Adapter.class)
  public enum RelationshipEnum {
    PARENT("Parent"),
    
    GRANDPARENT("Grandparent"),
    
    SELF("Self"),
    
    AUNT_UNCLE("Aunt/Uncle"),
    
    SIBLING("Sibling"),
    
    OTHER("Other"),
    
    EMPTY("");

    private String value;

    RelationshipEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelationshipEnum fromValue(String text) {
      for (RelationshipEnum b : RelationshipEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RelationshipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelationshipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelationshipEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RelationshipEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("relationship")
  private RelationshipEnum relationship = null;

  @SerializedName("student")
  private String student = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PARENT_GUARDIAN("Parent/Guardian"),
    
    EMERGENCY("Emergency"),
    
    PRIMARY("Primary"),
    
    SECONDARY("Secondary"),
    
    FAMILY("Family"),
    
    OTHER("Other"),
    
    EMPTY("");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public StudentRelationship relationship(RelationshipEnum relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @ApiModelProperty(value = "")
  public RelationshipEnum getRelationship() {
    return relationship;
  }

  public void setRelationship(RelationshipEnum relationship) {
    this.relationship = relationship;
  }

  public StudentRelationship student(String student) {
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @ApiModelProperty(value = "")
  public String getStudent() {
    return student;
  }

  public void setStudent(String student) {
    this.student = student;
  }

  public StudentRelationship type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentRelationship studentRelationship = (StudentRelationship) o;
    return Objects.equals(this.relationship, studentRelationship.relationship) &&
        Objects.equals(this.student, studentRelationship.student) &&
        Objects.equals(this.type, studentRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationship, student, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentRelationship {\n");
    
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

