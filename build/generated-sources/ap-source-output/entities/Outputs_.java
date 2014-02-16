package entities;

import entities.MeasurementUnits;
import entities.OutputOriginType;
import entities.OutputsTypeValue;
import entities.SensorTags;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
@StaticMetamodel(Outputs.class)
public class Outputs_ { 

    public static volatile SingularAttribute<Outputs, OutputOriginType> idOutputOriginType;
    public static volatile SingularAttribute<Outputs, Float> outputValue;
    public static volatile SingularAttribute<Outputs, Integer> idOutput;
    public static volatile SingularAttribute<Outputs, String> genericTag;
    public static volatile SingularAttribute<Outputs, Date> insertDate;
    public static volatile SingularAttribute<Outputs, MeasurementUnits> idMeasurementUnit;
    public static volatile SingularAttribute<Outputs, Boolean> isValid;
    public static volatile SingularAttribute<Outputs, SensorTags> sensorTag;
    public static volatile SingularAttribute<Outputs, OutputsTypeValue> idOutputsTypeValue;

}